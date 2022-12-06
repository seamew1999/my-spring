package com.seamew.springframework.context;

import java.util.EventObject;

/**
 * @Author: seamew
 * @Title: ApplicationEvent
 * @CreateTime: 2022年11月16日 16:09:00
 * @Description: 以继承 java.util.EventObject 定义出具备事件功能的抽象类 ApplicationEvent，后续所有事件的类都需要继承这个类。
 * @Version: 1.0
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
