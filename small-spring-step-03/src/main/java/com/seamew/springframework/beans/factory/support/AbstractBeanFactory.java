package com.seamew.springframework.beans.factory.support;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.BeanFactory;
import com.seamew.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: seamew
 * @Title: AbstractBeanFactory
 * @CreateTime: 2022年09月28日 16:19:00
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName) throws BeansException {
        return getBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
