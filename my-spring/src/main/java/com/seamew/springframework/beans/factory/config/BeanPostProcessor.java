package com.seamew.springframework.beans.factory.config;

import com.seamew.springframework.beans.BeansException;

/**
 * @Author: seamew
 * @Title: BeanPostProcessor
 * @CreateTime: 2022年10月13日 16:00:00
 * @Description: 用于修改新实例化 Bean 对象的扩展点
 * @Version: 1.0
 */
public interface BeanPostProcessor {
    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    default Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }


    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    default Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
