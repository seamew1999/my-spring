package com.seamew.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: seamew
 * @Title: MyInvocationHandler
 * @CreateTime: 2022年09月29日 10:34:00
 * @Description:
 * @Version: 1.0
 */
public class MyInvocationHandler implements InvocationHandler {
    // 被代理类对象的声明
    Object obj;

    // 动态的创建一个代理类的对象
    public Object getProxyInstance(Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj, args);
    }
}
