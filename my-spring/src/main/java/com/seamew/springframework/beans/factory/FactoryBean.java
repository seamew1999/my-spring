package com.seamew.springframework.beans.factory;

/**
 * @Author: seamew
 * @Title: FactoryBean
 * @CreateTime: 2022年10月24日 15:51:00
 * @Description: factoryBean 提供了其他框架交互的逻辑 可以动态的扩展其他类的接口
 * @Version: 1.0
 */
public interface FactoryBean<T> {
    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
