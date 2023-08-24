package com.seamew.springframework.context.event;

import com.seamew.springframework.context.ApplicationContext;
import com.seamew.springframework.context.ApplicationEvent;

/**
 * @Author: seamew
 * @Title: ApplicationContextEvent
 * @CreateTime: 2022年11月16日 16:10:00
 * @Description: ApplicationContextEvent 是定义事件的抽象类，所有的事件包括关闭、刷新，以及用户自己实现的事件，都需要继承这个类。
 * @Version: 1.0
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
