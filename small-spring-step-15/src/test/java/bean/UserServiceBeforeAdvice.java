package bean;

import com.seamew.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: seamew
 * @Title: UserServiceBeforeAdvice
 * @CreateTime: 2022年12月04日 15:37:00
 * @Description:
 * @Version: 1.0
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }
}
