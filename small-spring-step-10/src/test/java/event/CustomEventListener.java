package event;

import com.seamew.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @Author: seamew
 * @Title: CustomEventListener
 * @CreateTime: 2022年11月16日 19:10:00
 * @Description:
 * @Version: 1.0
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }
}
