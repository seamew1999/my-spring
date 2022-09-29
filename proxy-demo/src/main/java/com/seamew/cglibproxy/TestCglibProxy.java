package com.seamew.cglibproxy;

import com.seamew.dynamicproxy.Man;
import com.seamew.dynamicproxy.SuperMan;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Author: seamew
 * @Title: TestCglibProxy
 * @CreateTime: 2022年09月29日 15:19:00
 * @Description: cglib 简介
 * @Version: 1.0
 */
public class TestCglibProxy {
    /**
     * 静态代理和JDK 代理模式都要求目标对象是实现一个接口,
     * 但是有时候目标对象只是一个单独的对象,
     * 并没有实现任何的接口,这个时候可使用目标对象子类来实现代理-这就是Cglib 代理。
     */
    public static void main(String[] args) {
        // 创建一个被代理类的对象
        SuperMan superMan = new SuperMan();
        String path = CGLibProxy.class.getResource(".").getPath();
        System.out.println(path);
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, path);
        CGLibProxy cgLibProxy = new CGLibProxy();
        // 返回一个代理类的对象--注意这里现在传入的是实现类
        Object obj = cgLibProxy.getProxyInstance(superMan);
        System.out.println(obj.getClass());
        SuperMan man = (SuperMan) obj;
        man.self();
        // Man hu = (Man) obj;
        // // 通过代理类的对象调用重写的抽象方法
        // hu.info();
        // System.out.println();
        // hu.fly();
    }
    /**
     * ③ Cglib动态代理总结
     * ① CGlib可以传入接口也可以传入普通的类，接口使用实现的方式,普通类使用会使用继承的方式生成代理类。
     * 通常使用Cglib的时候侧重于实际实现类！！
     * ② 由于是继承方式,如果是 static方法,private方法,final方法是不能被代理的。
     * ③ CGLIB会默认代理Object中equals,toString,hashCode,clone等方法。比JDK代理多了clone。
     */
}
