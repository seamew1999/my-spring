package com.seamew.springframework.aop;

/**
 * @Author: seamew
 * @Title: TargetSource
 * @CreateTime: 2022年11月29日 15:23:00
 * @Description: 是一个目标对象，在目标对象类中提供 Object 入参属性，以及获取目标类 TargetClass 信息。
 * @Version: 1.0
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    public Class<?>[] getTargetClass(){
        return this.target.getClass().getInterfaces();
    }

    public Object getTarget(){
        return this.target;
    }


}
