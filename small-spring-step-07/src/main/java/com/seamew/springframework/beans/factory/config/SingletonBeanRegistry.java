package com.seamew.springframework.beans.factory.config;

/**
 * @Author: seamew
 * @Title: SingletonBeanRegistry
 * @CreateTime: 2022年09月28日 16:17:00
 * @Description: 单例bean注册
 * @Version: 1.0
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
