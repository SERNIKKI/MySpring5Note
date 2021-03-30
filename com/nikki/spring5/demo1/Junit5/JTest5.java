package com.nikki.spring5.demo1.Junit5;


import com.nikki.spring5.demo1.jdbc.JdbcConfig;
import com.nikki.spring5.demo1.jdbc.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = JdbcConfig.class)
@SpringJUnitConfig(classes = JdbcConfig.class)
public class JTest5 {
    @Autowired
    private BookService bookService;
    @Test
    public void test(){
        System.out.println(bookService.selectForID());
    }
}
