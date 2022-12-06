package com.seamew.springframework.context.event;

import com.seamew.springframework.beans.factory.BeanFactory;
import com.seamew.springframework.context.ApplicationEvent;
import com.seamew.springframework.context.ApplicationListener;

/**
 * @Author: seamew
 * @Title: SimpleApplicationEventMulticaster
 * @CreateTime: 2022年11月16日 17:37:00
 * @Description: 事件广播器的简单实现也是唯一实现
 * @Version: 1.0
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster{

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
