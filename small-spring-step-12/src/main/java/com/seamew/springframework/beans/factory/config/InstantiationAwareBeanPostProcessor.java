package com.seamew.springframework.beans.factory.config;

import com.seamew.springframework.beans.BeansException;

/**
 * @Author: seamew
 * @Title: InstantiationAwareBeanPostProcessor
 * @CreateTime: 2022年11月29日 22:21:00
 * @Description:
 * @Version: 1.0
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

}
