package com.seamew.staticproxy;

/**
 * @Author: seamew
 * @Title: Client
 * @CreateTime: 2022年09月29日 10:28:00
 * @Description:
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象(被代理对象)
        Person person = new Person();
        //创建代理对象, 同时将被代理对象传递给代理对象
        PersonProxy proxy = new PersonProxy(person);
        //通过代理对象，调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        proxy.eat();
    }
}
