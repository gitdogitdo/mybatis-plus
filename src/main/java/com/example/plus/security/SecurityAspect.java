package com.example.plus.security;

import com.example.plus.service.AuthService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Dokit
 * @Date: 2019/10/10 16:06
 */
@Aspect // 切面
@Component
public class SecurityAspect {

    @Autowired
    AuthService authService;
    // 切哪些东西  拦截方法上面有adminOnly注解的
    @Pointcut("@annotation(AdminOnly)")
    public void adminObly(){

    }
    // 切入到了adminOnly 在织入代码之前在代码里面执行before 里面的代码
    @Before("adminOnly")
    public void check(){
        authService.checkAccess();
    }


}
