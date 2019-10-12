package com.example.plus.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author: Dokit
 * @Date: 2019/10/11 15:44
 */
public class JdkProxyClient {
    public static void main(String[] args) {
      Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),
              new Class[]{Subject.class},new JdkProxySubject(new RealSubject()));
        subject.request();
    }
}
