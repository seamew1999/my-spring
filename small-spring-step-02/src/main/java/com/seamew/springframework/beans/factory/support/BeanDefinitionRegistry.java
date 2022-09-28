package com.seamew.springframework.beans.factory.support;

import com.seamew.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: seamew
 * @Title: BeanDefinitionRegistry
 * @CreateTime: 2022年09月28日 16:33:00
 * @Description:
 * @Version: 1.0
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     * 最新的spring这个借口与
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
