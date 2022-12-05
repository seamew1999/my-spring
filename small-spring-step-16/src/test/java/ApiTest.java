import bean.Husband;
import bean.Wife;
import com.seamew.springframework.aop.framework.Cglib2AopProxy;
import com.seamew.springframework.context.support.ClassPathXmlApplicationContext;
import com.seamew.springframework.utils.ClassUtils;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @Author: seamew
 * @Title: ApiTest
 * @CreateTime: 2022年12月05日 14:29:00
 * @Description:
 * @Version: 1.0
 */
public class ApiTest {
    @Test
    public void test_circular() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println("老公的媳妇：" + husband.queryWife());
        System.out.println("媳妇的老公：" + wife.queryHusband());
    }

}
