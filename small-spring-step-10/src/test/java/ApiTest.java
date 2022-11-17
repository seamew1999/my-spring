import com.seamew.springframework.context.support.ClassPathXmlApplicationContext;
import event.CustomEvent;
import org.junit.Test;

/**
 * @Author: seamew
 * @Title: ApiTest
 * @CreateTime: 2022年11月16日 19:15:00
 * @Description:
 * @Version: 1.0
 */
public class ApiTest {
    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1L, "成功了！"));

    }

}
