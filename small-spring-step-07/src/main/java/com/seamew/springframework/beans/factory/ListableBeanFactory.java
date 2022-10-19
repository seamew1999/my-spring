package com.seamew.springframework.beans.factory;

import com.seamew.springframework.beans.BeansException;

import java.util.Map;

/**
 * @Author: seamew
 * @Title: ListableBeanFactory
 * @CreateTime: 2022年10月13日 16:05:00
 * @Description: 扩展 bean 工厂接口
 * @Version: 1.0
 */
public interface ListableBeanFactory extends BeanFactory {
    /**
     * 按照类型返回 Bean 实例
     *
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有 Bean 名称
     *
     * @return
     */
    String[] getBeanDefinitionNames();
}
