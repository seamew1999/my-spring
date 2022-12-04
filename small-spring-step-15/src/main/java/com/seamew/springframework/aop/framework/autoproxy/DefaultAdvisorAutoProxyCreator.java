package com.seamew.springframework.aop.framework.autoproxy;

/**
 * @Author: seamew
 * @Title: DefaultAdvisorAutoProxyCreator
 * @CreateTime: 2022年11月29日 22:05:00
 * @Description: 融入Bean生命周期的自动代理创建者
 * @Version: 1.0
 */


import com.seamew.springframework.aop.*;
import com.seamew.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import com.seamew.springframework.aop.framework.ProxyFactory;
import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.PropertyValues;
import com.seamew.springframework.beans.factory.BeanFactory;
import com.seamew.springframework.beans.factory.BeanFactoryAware;
import com.seamew.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import com.seamew.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;

import java.util.Collection;

/**
 * 这个 DefaultAdvisorAutoProxyCreator 类的主要核心实现在于 postProcessBeforeInstantiation 方法中，
 * 从通过 beanFactory.getBeansOfType 获取 AspectJExpressionPointcutAdvisor 开始。
 * 获取了 advisors 以后就可以遍历相应的 AspectJExpressionPointcutAdvisor 填充对应的属性信息，
 * 包括：目标对象、拦截方法、匹配器，之后返回代理对象即可。
 * 那么现在调用方获取到的这个 Bean 对象就是一个已经被切面注入的对象了，当调用方法的时候，则会被按需拦截，处理用户需要的信息。
 */
public class DefaultAdvisorAutoProxyCreator implements InstantiationAwareBeanPostProcessor, BeanFactoryAware {
    private DefaultListableBeanFactory beanFactory;


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = (DefaultListableBeanFactory) beanFactory;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (isInfrastructureClass(bean.getClass())) return bean;

        Collection<AspectJExpressionPointcutAdvisor> advisors = beanFactory.getBeansOfType(AspectJExpressionPointcutAdvisor.class).values();

        for (AspectJExpressionPointcutAdvisor advisor : advisors) {
            ClassFilter classFilter = advisor.getPointcut().getClassFilter();
            // 过滤匹配类
            if (!classFilter.matches(bean.getClass())) continue;

            AdvisedSupport advisedSupport = new AdvisedSupport();

            TargetSource targetSource = new TargetSource(bean);
            advisedSupport.setTargetSource(targetSource);
            advisedSupport.setMethodInterceptor((MethodInterceptor) advisor.getAdvice());
            advisedSupport.setMethodMatcher(advisor.getPointcut().getMethodMatcher());
            advisedSupport.setProxyTargetClass(false);

            // 返回代理对象
            return new ProxyFactory(advisedSupport).getProxy();
        }

        return bean;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        return null;
    }

    /**
     * Advisor 其实就包含了 Pointcut ， Advice
     *
     * @param beanClass
     * @return
     */
    private boolean isInfrastructureClass(Class<?> beanClass) {
        return Advice.class.isAssignableFrom(beanClass) || Pointcut.class.isAssignableFrom(beanClass) || Advisor.class.isAssignableFrom(beanClass);
    }
}
