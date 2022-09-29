package com.seamew.dynamicproxy;

import java.util.Arrays;

/**
 * @Author: seamew
 * @Title: Client
 * @CreateTime: 2022年09月29日 11:05:00
 * @Description:
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws Throwable {
        //创建一个被代理类的对象
        SuperMan man = new SuperMan();
        //创建调用处理程序
        MyInvocationHandler handler = new MyInvocationHandler();
        //返回一个代理类的对象
        Object obj = handler.getProxyInstance(man);
        System.out.println(obj.getClass());
        //代理实例 强转
        Man hu = (Man) obj;
        //通过代理类的对象调用重写的抽象方法
        hu.info();

        System.out.println();

        hu.fly();

    }
}
