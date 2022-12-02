package com.seamew.springframework.beans.factory;

/**
 * @Author: seamew
 * @Title: BeanNameAware
 * @CreateTime: 2022年10月24日 11:22:00
 * @Description:
 * @Version: 1.0
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}