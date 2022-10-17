import bean.UserService;
import com.seamew.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.seamew.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.seamew.springframework.context.support.ClassPathXmlApplicationContext;
import common.MyBeanFactoryPostProcessor;
import common.MyBeanPostProcessor;
import org.junit.Test;

/**
 * @Author: seamew
 * @Title: ApiTest
 * @CreateTime: 2022年10月14日 16:00:00
 * @Description:
 * @Version: 1.0
 */
public class ApiTest {
    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.读取配置文件 & 注册 Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");
        // 3.BeanDefinition 加载完成 & Bean 实例化之前，修改 BeanDefinition 的属性值
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        // 4.Bean 实例化之后，修改 Bean 属性信息
        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);
        // 5.获取 Bean 对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        System.out.println("测试结果: " + userService.queryUserInfo());
    }


    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");
        // 2.获取 Bean 对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService.queryUserInfo());
    }
}
