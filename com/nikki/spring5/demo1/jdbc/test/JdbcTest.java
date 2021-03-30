package com.nikki.spring5.demo1.jdbc.test;

import com.nikki.spring5.demo1.jdbc.JdbcConfig;
import com.nikki.spring5.demo1.jdbc.entity.Rhesis;
import com.nikki.spring5.demo1.jdbc.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class JdbcTest {
    //手动添加日志
    private static final Logger log = LoggerFactory.getLogger(JdbcTest.class);
    @Test
    public void test(){
        log.info("info");
        log.warn("warn");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.demo();
    }

    //函数式风格创建对象，交给spring管理
    //GenericApplicationContext
    @Test
    public void testGenericApplicationContext(){
        //创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //在spring中进行注册
        context.refresh();
        context.registerBean("rhesis",Rhesis.class,()->new Rhesis());
        //获取在spring注册的对象
//        Rhesis rhesis = (Rhesis) context.getBean("com.nikki.spring5.demo1.jdbc.entity.Rhesis");
        Rhesis rhesis = (Rhesis) context.getBean("rhesis");
        System.out.println(rhesis);

    }
}
