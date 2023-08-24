package com.seamew.springframework.beans.factory.config;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.BeanFactory;

/**
 * @Author: seamew
 * @Title: AutowireCapableBeanFactory
 * @CreateTime: 2022年10月13日 16:09:00
 * @Description: 自动化配置的 Bean 工厂配置的接口，配合 Bean 的初始化
 * @Version: 1.0
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessAfterInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
