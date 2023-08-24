package com.seamew.springframework.beans.factory.config;

import com.seamew.springframework.beans.factory.HierarchicalBeanFactory;
import com.seamew.springframework.utils.StringValueResolver;

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

    /**
     * 销毁单例对象
     */
    void destroySingletons();

    /**
     * Add a String resolver for embedded values such as annotation attributes.
     * @param valueResolver the String resolver to apply to embedded values
     * @since 3.0
     */
    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    /**
     * Resolve the given embedded value, e.g. an annotation attribute.
     * @param value the value to resolve
     * @return the resolved value (may be the original value as-is)
     * @since 3.0
     */
    String resolveEmbeddedValue(String value);
}
