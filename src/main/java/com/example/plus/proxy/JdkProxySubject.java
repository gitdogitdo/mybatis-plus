package com.example.plus.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Dokit
 * @Date: 2019/10/11 14:20
 */
// 想当于AOP的aspect
public class JdkProxySubject implements InvocationHandler {

    // 引用目标对象
    private RealSubject object;
    public  JdkProxySubject(RealSubject subject){
        this.object = subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try{
            // 通过反射执行目标对象的方法 args为参数
            method.invoke(object,args);
        }catch (Exception e){
        }finally {

        }
        return  null;
    }
}
