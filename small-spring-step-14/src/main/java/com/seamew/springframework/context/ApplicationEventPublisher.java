package com.seamew.springframework.context;

/**
 * @Author: seamew
 * @Title: ApplicationEventPublisher
 * @CreateTime: 2022年11月16日 17:31:00
 * @Description: 事件发布器接口
 * @Version: 1.0
 */
public interface ApplicationEventPublisher {
    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);
}
