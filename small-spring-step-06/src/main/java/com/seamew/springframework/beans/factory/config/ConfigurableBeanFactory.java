package com.seamew.springframework.beans.factory.config;

import com.seamew.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Author: seamew
 * @Title: ConfigurableBeanFactory
 * @CreateTime: 2022年10月13日 15:58:00
 * @Description: 获取 BeanPostProcessor
 * @Version: 1.0
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
