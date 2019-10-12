package com.example.plus.proxy;

/**
 * @Author: Dokit
 * @Date: 2019/10/11 14:54
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("哈哈");
    }

    @Override
    public void hello() {
    // jdk 和cdlib 区别
    }
}
