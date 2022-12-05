package com.seamew.springframework.context.event;

import com.seamew.springframework.context.ApplicationEvent;
import com.seamew.springframework.context.ApplicationListener;

/**
 * @Author: seamew
 * @Title: ApplicationEventMulticaster
 * @CreateTime: 2022年11月16日 16:30:00
 * @Description: 事件广播器接口
 * @Version: 1.0
 */
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}
