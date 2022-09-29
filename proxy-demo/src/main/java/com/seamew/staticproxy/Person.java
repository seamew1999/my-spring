package com.seamew.staticproxy;

/**
 * @Author: seamew
 * @Title: Person
 * @CreateTime: 2022年09月29日 10:26:00
 * @Description:
 * @Version: 1.0
 */
public class Person implements Handler{
    @Override
    public void eat() {
        System.out.println(" 人吃东西  。。。。。");
    }
}
