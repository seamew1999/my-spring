package bean;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.DisposableBean;
import com.seamew.springframework.beans.InitializingBean;
import com.seamew.springframework.beans.factory.BeanClassLoaderAware;
import com.seamew.springframework.beans.factory.BeanFactory;
import com.seamew.springframework.beans.factory.BeanFactoryAware;
import com.seamew.springframework.beans.factory.BeanNameAware;
import com.seamew.springframework.context.ApplicationContext;
import com.seamew.springframework.context.ApplicationContextAware;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: seamew
 * @Title: UserService
 * @CreateTime: 2022年10月12日 15:51:00
 * @Description:
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserService implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {
    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;

    private String uId;
    private String company;
    private String location;
    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is：" + name);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("ClassLoader：" + classLoader);
    }
}
