package com.seamew.springframework.beans.factory.config;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Author: seamew
 * @Title: BeanFactoryPostProcessor
 * @CreateTime: 2022年10月13日 15:49:00
 * @Description:
 * @Version: 1.0
 */
public interface BeanFactoryPostProcessor {
    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
