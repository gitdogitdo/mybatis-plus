package com.example.plus.proxy;

/**
 * @Author: Dokit
 * @Date: 2019/10/11 14:55
 */
//代理对选哪个
public class Proxy implements Subject{
    private RealSubject realSubject;
    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }
    @Override
    public void request() {
        // 代理对象只是在前后
        System.out.println("before");
        try{
            // 还是委托给目标对象执行
            realSubject.request();
        }catch (Exception e){

        }finally {
            System.out.println("after");
        }

    }

    @Override
    public void hello() {

    }
}
