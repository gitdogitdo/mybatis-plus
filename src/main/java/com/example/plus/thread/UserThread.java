package com.example.plus.thread;

import com.example.plus.entity.FUser;
import com.example.plus.utils.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class UserThread implements Runnable{
    private List<FUser> userList;

    public UserThread() {
        super();
    }

    public UserThread(List<FUser> userList) {
        this();
        this.userList = userList;
    }
    // 初始化用户信息的方法
    public static List<FUser> init() {

        List<FUser> userList = new ArrayList<FUser>();
        for(Integer i = 1; i <= 11; i++){
//            FUser user = new FUser(i.toString(), i.toString());
            FUser fUser = new FUser();
            fUser.setId(i.toString());
            fUser.setName(i.toString());
            userList.add(fUser);
        }
        return userList;
    }

    @Override
    public void run() {
        for(FUser user:userList) {
            System.out.println(Thread.currentThread().getName() + " 已向 " + user + "发送短信  ");
        }
    }

    public static void main(String[] args) {
        // 初始化用户信息
        List<FUser> allUserList = init();
        // 这里是为每个线程分配两名用户
        int threadSize = 2;
        // 调用分配方法
        List<List<FUser>> splitUserList = ListUtils.splitList(allUserList, threadSize);
        for(int i = 0; i < splitUserList.size(); i++) {
            List<FUser> list = splitUserList.get(i);
            // 创建短信发送线程，执行线程
            UserThread ut = new UserThread(list);
            Thread t = new Thread(ut);
            // 开启线程

            // 为什么要用多线程？
            // 无非就是在主线程开辟多条线程,提高效率, 如果是调用run
            // 方法的话无非就是执行主线程的一个方法,并不是在其本身的线程,线程对象也只是一个普通的对象,这样就违背了当初创建线程的初衷。
            //start 是在主线程的基础上重新开启多个线程,而且多个线程可以一起执行,不必等待其他线程运行完，只需得到cpu就可运行。
        }
    }
}
