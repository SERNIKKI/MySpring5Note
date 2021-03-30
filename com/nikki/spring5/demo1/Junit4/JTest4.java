package com.nikki.spring5.demo1.Junit4;

import com.nikki.spring5.demo1.jdbc.JdbcConfig;
import com.nikki.spring5.demo1.jdbc.service.BookService;
import com.nikki.spring5.demo1.jdbc.test.JdbcTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.awt.*;

@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架
@ContextConfiguration(classes = JdbcConfig.class)//加载配置文件
public class JTest4 {
    @Autowired
    private BookService bookService;
    @Test
    public void test(){
        System.out.println(bookService.selectForID());
    }
}
