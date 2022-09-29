package com.seamew.staticproxy;

/**
 * @Author: seamew
 * @Title: PersonProxy
 * @CreateTime: 2022年09月29日 10:27:00
 * @Description:
 * @Version: 1.0
 */
public class PersonProxy implements Handler{
    private Handler target;

    public PersonProxy(Handler handler) {
        this.target = handler;
    }

    @Override
    public void eat() {
        System.out.println("开始代理  完成某些操作。。。。。 ");
        target.eat();
        System.out.println("提交。。。。。");
    }
}
