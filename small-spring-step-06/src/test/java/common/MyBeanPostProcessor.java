package common;

import bean.UserService;
import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: seamew
 * @Title: MyBeanPostProcessor
 * @CreateTime: 2022年10月14日 15:57:00
 * @Description:
 * @Version: 1.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为: 北京");
        }
        return bean;
    }

}
