package com.example.plus.proxy;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Author: Dokit
 * @Date: 2019/10/11 15:05
 */
public class Client {

    public static void main(String[] args) {
        // 客户端通过接口去引用这个目标对象,引入的实现类是代理实现类，代理实现类实际上委托给了目标类
        /*Subject proxy = new Proxy(new RealSubject());
        proxy.request();
        proxy.hello();*/
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class); // 实际业务对象
        enhancer.setCallback(new DemoMethodIntercepror()); // 实际要织入的代码
        Subject o = (Subject) enhancer.create(); // 目标对象
        o.request();
    }
}
