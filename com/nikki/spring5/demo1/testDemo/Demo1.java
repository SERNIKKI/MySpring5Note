package com.nikki.spring5.demo1.testDemo;

import com.nikki.spring5.demo1.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book",Book.class);
        System.out.println(book.toString());
    }
}
