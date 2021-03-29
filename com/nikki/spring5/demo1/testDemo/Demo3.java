package com.nikki.spring5.demo1.testDemo;

import com.nikki.spring5.demo1.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3 {
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp3",Emp.class);
        emp.add();
    }
}
