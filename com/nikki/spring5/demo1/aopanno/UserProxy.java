package com.nikki.spring5.demo1.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//实现增强方法的类
@Component
@Aspect
@Order(2)
public class UserProxy {
    //切入点抽取
    @Pointcut(value = "execution(* com.nikki.spring5.demo1.aopanno.User.add(..))")
    public void point(){

    }
    //前置通知
    @Before(value = "point()")
    public void before(){
        System.out.println("before...");
    }
    //后置通知
    @AfterReturning(value = "execution(* com.nikki.spring5.demo1.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("AfterReturning...");
    }
    //最终通知
    @After(value = "execution(* com.nikki.spring5.demo1.aopanno.User.add(..))")
    public void after(){
        System.out.println("After...");
    }
    //异常时通知
    @AfterThrowing(value = "execution(* com.nikki.spring5.demo1.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("AfterThrowing...");
    }
    //环绕通知
    @Around(value = "execution(* com.nikki.spring5.demo1.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知...");
//        proceedingJoinPoint.proceed();
//        System.out.println("环绕之后...");
        try {
            System.out.println("前置通知...");
            proceedingJoinPoint.proceed();
            System.out.println("后置通知...");
        }catch (Exception e){
            System.out.println("异常通知...");
        }finally {
            System.out.println("最终通知...");
        }
    }
}
