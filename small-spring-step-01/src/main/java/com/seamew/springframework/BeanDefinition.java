package com.seamew.springframework;

/**
 * @Author: seamew
 * @Title: BeanDefinition
 * @CreateTime: 2022年09月28日 15:41:00
 * @Description:
 * @Version: 1.0
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
