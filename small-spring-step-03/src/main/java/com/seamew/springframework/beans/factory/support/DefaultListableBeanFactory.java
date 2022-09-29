package com.seamew.springframework.beans.factory.support;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: seamew
 * @Title: DefaultListableBeanFactory
 * @CreateTime: 2022年09月28日 16:32:00
 * @Description:
 * @Version: 1.0
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
