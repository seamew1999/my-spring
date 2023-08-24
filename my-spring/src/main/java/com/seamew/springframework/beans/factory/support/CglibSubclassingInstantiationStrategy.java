package com.seamew.springframework.beans.factory.support;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * @Author: seamew
 * @Title: CglibSubclassingInstantiationStrategy
 * @CreateTime: 2022年09月29日 10:13:00
 * @Description: Cglib创建bean对象
 * @Version: 1.0
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (ctor == null) return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
