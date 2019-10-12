package com.example.plus.service;

import com.example.plus.security.CurrentUserHolder;

/**
 * @Author: Dokit
 * @Date: 2019/10/10 15:58
 */
public class AuthService {
    public void  checkAccess(){
        String s = CurrentUserHolder.get();
        if("admin".equals(s)){
            throw new RuntimeException("Exception");
        }
    }
}
