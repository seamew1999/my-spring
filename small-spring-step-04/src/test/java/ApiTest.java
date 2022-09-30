import bean.UserDao;
import bean.UserService;
import com.seamew.springframework.beans.PropertyValue;
import com.seamew.springframework.beans.PropertyValues;
import com.seamew.springframework.beans.factory.config.BeanDefinition;
import com.seamew.springframework.beans.factory.config.BeanReference;
import com.seamew.springframework.beans.factory.support.DefaultListableBeanFactory;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @Author: seamew
 * @Title: ApiTest
 * @CreateTime: 2022年09月29日 16:19:00
 * @Description:
 * @Version: 1.0
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue("id", "10001");
        propertyValues.addPropertyValue("userDao", new BeanReference("userDao"));
        // 4. UserService 注入bean
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class, propertyValues));
        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
