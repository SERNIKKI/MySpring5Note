package com.nikki.spring5.demo1.service;

import com.nikki.spring5.demo1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserClass {
    @Value("abc")
    private String name;
    @Autowired //根据类型进行注入
    @Qualifier(value = "userDaoImpl1") //根据类型名称进行注入
    @Resource(name = "userDaoImpl1") //既可以根据类型进行注入，也可以根据名称进行注入
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        System.out.println(name + " service add ...");
        userDao.update();
    }
}
