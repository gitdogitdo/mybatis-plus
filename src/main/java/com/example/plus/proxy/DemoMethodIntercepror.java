package com.example.plus.proxy;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;

/**
 * @Author: Dokit
 * @Date: 2019/10/11 16:22
 */
public class DemoMethodIntercepror implements MethodInterceptor {
    @Override
    @Transactional
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = null;
        try{
          result = methodProxy.invokeSuper(o,objects);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("after");
        }
        return result;
    }
}
