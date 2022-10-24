package com.seamew.springframework.beans.factory;

/**
 * @Author: seamew
 * @Title: FactoryBean
 * @CreateTime: 2022年10月24日 15:51:00
 * @Description:
 * @Version: 1.0
 */
public interface FactoryBean<T> {
    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
