package com.seamew.springframework.beans.factory;

/**
 * @Author: seamew
 * @Title: BeanClassLoaderAware
 * @CreateTime: 2022年10月24日 11:22:00
 * @Description: 感知classLoader
 * @Version: 1.0
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);

}