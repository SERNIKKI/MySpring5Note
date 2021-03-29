package com.nikki.spring5.demo1.aopanno;

import org.springframework.stereotype.Component;

//将要被增强的对象
@Component(value = "userP")
public class User {
    public String add(){
        System.out.println("add....");
        return "123";
    }
}
