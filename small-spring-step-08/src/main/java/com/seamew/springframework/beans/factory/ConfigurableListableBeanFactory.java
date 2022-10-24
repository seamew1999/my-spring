package com.seamew.springframework.beans.factory;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.seamew.springframework.beans.factory.config.BeanDefinition;
import com.seamew.springframework.beans.factory.config.BeanPostProcessor;
import com.seamew.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author: seamew
 * @Title: ConfigurableListableBeanFactory
 * @CreateTime: 2022年10月13日 16:08:00
 * @Description: 提供分析和修改 Bean 实例的操作接口，对 Bean 进行配置
 * @Version: 1.0
 */
/*
    这个类主要是对 Bean 进行分析和配置的类，是一个较为轻量的接口
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    @Override
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
