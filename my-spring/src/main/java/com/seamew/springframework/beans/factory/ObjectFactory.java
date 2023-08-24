package com.seamew.springframework.beans.factory;

import com.seamew.springframework.beans.BeansException;

/**
 * @Author: seamew
 * @Title: ObjectFactory
 * @CreateTime: 2022年12月04日 16:53:00
 * @Description: 一个普通的对象工厂接口
 * @Version: 1.0
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}