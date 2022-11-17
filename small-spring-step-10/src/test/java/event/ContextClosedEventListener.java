package event;

import com.seamew.springframework.context.ApplicationListener;
import com.seamew.springframework.context.event.ContextClosedEvent;

/**
 * @Author: seamew
 * @Title: ContextClosedEventListener
 * @CreateTime: 2022年11月16日 19:19:00
 * @Description:
 * @Version: 1.0
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + event.getSource());
    }

}