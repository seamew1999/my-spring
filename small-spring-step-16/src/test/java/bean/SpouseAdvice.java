package bean;

import com.seamew.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: seamew
 * @Title: SpouseAdvice
 * @CreateTime: 2022年12月05日 14:28:00
 * @Description:
 * @Version: 1.0
 */
public class SpouseAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("关怀小两口(切面)：" + method);
    }

}