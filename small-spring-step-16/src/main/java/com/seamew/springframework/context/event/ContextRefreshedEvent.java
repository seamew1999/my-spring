package com.seamew.springframework.context.event;

/**
 * @Author: seamew
 * @Title: ContextRefreshedEvent
 * @CreateTime: 2022年11月16日 16:12:00
 * @Description: 监听刷新
 * @Version: 1.0
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
