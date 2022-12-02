import bean.IUserService;
import com.seamew.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import com.seamew.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import com.seamew.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import com.seamew.springframework.context.support.ClassPathXmlApplicationContext;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

/**
 * @Author: seamew
 * @Title: ApiTest
 * @CreateTime: 2022年11月30日 17:18:00
 * @Description:
 * @Version: 1.0
 */
public class ApiTest {

    @Test
    public void test_aop() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}
