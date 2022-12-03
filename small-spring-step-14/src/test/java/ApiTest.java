import bean.IUserService;
import com.seamew.springframework.beans.factory.PropertyPlaceholderConfigurer;
import com.seamew.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Author: seamew
 * @Title: ApiTest
 * @CreateTime: 2022年12月03日 15:48:00
 * @Description:
 * @Version: 1.0
 */
public class ApiTest {
    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}
