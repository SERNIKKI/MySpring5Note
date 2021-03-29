package com.nikki.spring5.demo1.service;

import org.springframework.stereotype.Component;

//在注解中value可以不写，默认为类的名称，首字母小写
@Component(value = "user")
public class User {
    public void add(){
        System.out.println("add ...");
    }
}
