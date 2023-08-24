package com.seamew.springframework.beans.factory.support;

import com.seamew.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: seamew
 * @Title: BeanDefinitionRegistry
 * @CreateTime: 2022年09月28日 16:33:00
 * @Description: 注册 BeanDefinition
 * @Version: 1.0
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);
}
