package com.nikki.spring5.demo1.testDemo;

import com.nikki.spring5.demo1.service.UserClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserClass user = context.getBean("userClass",UserClass.class);
        System.out.println(user);
        user.add();
    }
}
