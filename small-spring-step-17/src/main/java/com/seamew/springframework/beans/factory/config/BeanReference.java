package com.seamew.springframework.beans.factory.config;

/**
 * @Author: seamew
 * @Title: BeanReference
 * @CreateTime: 2022年09月30日 10:42:00
 * @Description: bean的引用
 * @Version: 1.0
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
