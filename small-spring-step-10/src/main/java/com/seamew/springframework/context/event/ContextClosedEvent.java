package com.seamew.springframework.context.event;

/**
 * @Author: seamew
 * @Title: ContextClosedEvent
 * @CreateTime: 2022年11月16日 16:12:00
 * @Description: 监听关闭
 * @Version: 1.0
 */
public class ContextClosedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
