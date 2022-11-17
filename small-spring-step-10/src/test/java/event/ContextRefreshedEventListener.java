package event;

import com.seamew.springframework.context.ApplicationListener;
import com.seamew.springframework.context.event.ContextRefreshedEvent;

/**
 * @Author: seamew
 * @Title: ContextRefreshedEventListener
 * @CreateTime: 2022年11月16日 19:19:00
 * @Description:
 * @Version: 1.0
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + event.getSource());
    }

}