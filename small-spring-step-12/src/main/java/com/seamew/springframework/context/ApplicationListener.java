package com.seamew.springframework.context;

import java.util.EventListener;

/**
 * @Author: seamew
 * @Title: ApplicationListener
 * @CreateTime: 2022年11月16日 16:32:00
 * @Description:
 * @Version: 1.0
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {
    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);
}
