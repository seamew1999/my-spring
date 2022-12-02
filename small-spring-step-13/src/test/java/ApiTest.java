import bean.IUserService;
import com.seamew.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Author: seamew
 * @Title: ApiTest
 * @CreateTime: 2022年12月02日 15:40:00
 * @Description:
 * @Version: 1.0
 */
public class ApiTest {
    @Test
    public void test_property() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService);
    }

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}
