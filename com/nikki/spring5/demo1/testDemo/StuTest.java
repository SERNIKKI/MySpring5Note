package com.nikki.spring5.demo1.testDemo;

import com.nikki.spring5.demo1.aopanno.User;
import com.nikki.spring5.demo1.collection.Book;
import com.nikki.spring5.demo1.collection.Course;
import com.nikki.spring5.demo1.collection.Stu;
import com.nikki.spring5.demo1.config.SpringConfig;
import com.nikki.spring5.demo1.jdbc.JdbcConfig;
import com.nikki.spring5.demo1.jdbc.service.BookService;
import com.nikki.spring5.demo1.service.UserClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class StuTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:stuBean.xml"});
        Stu stu = (Stu) context.getBean("stu",Stu.class);
        stu.test();
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:stuBean2.xml"});
        Book stu = (Book) context.getBean("book", Book.class);
        stu.out();
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:stuBean3.xml"});
        Course course = (Course) context.getBean("myBean", Course.class);
        System.out.println(course);
    }
    @Test
    public void test4(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserClass user = context.getBean("userClass",UserClass.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:bean.xml"});
        User user = context.getBean("userP", User.class);
        user.add();
    }
    @Test
    public void test6(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.selectAll());
    }
}
