package com.seamew.springframework.beans.factory.support;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.FactoryBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: seamew
 * @Title: FactoryBeanRegistrySupport
 * @CreateTime: 2022年10月24日 15:51:00
 * @Description:
 * @Version: 1.0
 */
public class FactoryBeanRegistrySupport extends DefaultSingletonBeanRegistry {
    // 用于存放单例类型的对象，避免重复创建。在日常使用用，基本也都是创建的单例对象
    private final Map<String, Object> factoryBeanObjectCache = new ConcurrentHashMap<>();

    protected Object getCachedObjectForFactoryBean(String beanName) {
        Object object = this.factoryBeanObjectCache.get(beanName);
        return object != NULL_OBJECT ? object : null;
    }

    /**
     * 为了防止 this.factoryBeanObjectCache.get(beanName) 代码返回的是一个空对象
     * 导致重复调用 doGetObjectFromFactoryBean 方法
     *
     * @param factory
     * @param beanName
     * @return
     */
    protected Object getObjectFromFactoryBean(FactoryBean factory, String beanName) {
        if (factory.isSingleton()) {
            // 线程安全，防止多次创建单例对象
            Object object = this.factoryBeanObjectCache.get(beanName);
            // 为了防止多次put进去导致报错
            if (object == null) {
                object = doGetObjectFromFactoryBean(factory, beanName);
                this.factoryBeanObjectCache.put(beanName, object != null ? object : NULL_OBJECT);
            }
            return object != NULL_OBJECT ? object : null;
        } else {
            return doGetObjectFromFactoryBean(factory, beanName);
        }
    }

    /**
     * doGetObjectFromFactoryBean 是具体的获取 FactoryBean#getObject() 方法，
     * 因为既有缓存的处理也有对象的获取，所以额外提供了 getObjectFromFactoryBean 进行逻辑包装，
     *
     * @param factory
     * @param beanName
     * @return
     */
    private Object doGetObjectFromFactoryBean(final FactoryBean factory, final String beanName) {
        try {
            return factory.getObject();
        } catch (Exception e) {
            throw new BeansException("FactoryBean threw exception on object[" + beanName + "] creation", e);
        }
    }
}
