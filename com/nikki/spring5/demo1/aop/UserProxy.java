package com.nikki.spring5.demo1.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

//创建代理对象代码
public class UserProxy implements InvocationHandler {
    //传递代理对象
    private final Object obj;
    public UserProxy(Object obj){
        this.obj = obj;
    }
    //写增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("之前... " + method.getName() + " 传递的参数:" + Arrays.toString(args));
        //要增强的方法
        Object invoke = method.invoke(obj, args);
        //方法之后
        System.out.println("之后... " + method.getName() + " 传递的参数:" + Arrays.toString(args));
        return invoke;
    }
}
