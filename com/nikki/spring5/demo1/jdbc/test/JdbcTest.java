package com.nikki.spring5.demo1.jdbc.test;

import com.nikki.spring5.demo1.jdbc.JdbcConfig;
import com.nikki.spring5.demo1.jdbc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.demo();
    }

}
