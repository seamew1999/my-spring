package com.seamew.springframework.beans.factory;

import com.seamew.springframework.beans.BeansException;

/**
 * @Author: seamew
 * @Title: BeanFactory
 * @CreateTime: 2022年09月28日 16:22:00
 * @Description:
 * @Version: 1.0
 */
public interface BeanFactory {
    /**
     * 是一个整体的方法
     * 可以获取单例也可以获取多例对象
     *
     * @param name
     * @return
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;

    Object getBean(String beanName, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
