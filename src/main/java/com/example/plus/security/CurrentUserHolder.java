package com.example.plus.security;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: Dokit
 * @Date: 2019/10/10 15:52
 */
public class CurrentUserHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static ThreadLocal<String> getHolder() {
        return holder;
    }
    public static void set(String user){
        holder.set(user);
    };
    public static String  get(){
        return holder.get() == null?"unknow":holder.get();
    };
}
