import bean.UserDao;
import bean.UserService;
import com.seamew.springframework.beans.factory.config.BeanDefinition;
import com.seamew.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: seamew
 * @Title: ApiTest
 * @CreateTime: 2022年10月19日 11:02:00
 * @Description:
 * @Version: 1.0
 */
public class ApiTest {
    @Test
    public void context() throws InvocationTargetException, IllegalAccessException {
        UserDao userDao = new UserDao();
        Method method = null;
        try {
            method = userDao.getClass().getMethod("init");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        method.invoke(userDao);
    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        // 2.获取 Bean 对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService.queryUserInfo());
        applicationContext.close();
    }
}
