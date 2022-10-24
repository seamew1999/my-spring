package com.seamew.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: seamew
 * @Title: Demo
 * @CreateTime: 2022年10月24日 21:53:00
 * @Description:
 * @Version: 1.0
 */
public class Demo {
    /**
     * return method.invoke(proxy, args);
     * 源码重复调用这个方法，导致堆栈溢出
     */
    private static void test() {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("你被代理了 " + method.getName());
                return null;
            }
        };
        Man man = (Man) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Man.class}, handler);
        man.fly();
        man.info();
    }

    public static void main(String[] args) {
        test();
    }
}
