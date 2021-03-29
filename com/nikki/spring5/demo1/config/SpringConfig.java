package com.nikki.spring5.demo1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //作为配置类替代配置文件
@ComponentScan(basePackages = {"com.nikki"})
public class SpringConfig {
}
