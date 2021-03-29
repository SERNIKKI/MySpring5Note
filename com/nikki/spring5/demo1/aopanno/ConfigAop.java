package com.nikki.spring5.demo1.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//完全注解开发
@Configuration
@ComponentScan(basePackages = {"com.nikki"})//开启组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true) //允许代理对象
public class ConfigAop {
}
