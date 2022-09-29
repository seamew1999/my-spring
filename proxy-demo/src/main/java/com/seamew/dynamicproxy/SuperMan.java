package com.seamew.dynamicproxy;

/**
 * @Author: seamew
 * @Title: SuperMan
 * @CreateTime: 2022年09月29日 10:33:00
 * @Description:
 * @Version: 1.0
 */
public class SuperMan implements Man{
    @Override
    public void info() {
        System.out.println("我是超人！我怕谁！");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly!");
    }

    public void self() {
        System.out.println("self");
    }
}
