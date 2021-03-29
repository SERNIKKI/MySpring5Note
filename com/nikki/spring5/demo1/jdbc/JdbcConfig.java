package com.nikki.spring5.demo1.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

//表示为注解配置文件
@Configuration
//开启组件扫描
@ComponentScan(basePackages = {"com.nikki.spring5.demo1.jdbc"})
//开启事务
@EnableTransactionManagement
public class JdbcConfig {
    @Bean(name = "dataSource")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://bt.sernikki.cn:3306/nikki?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        dataSource.setUsername("nikki");
        dataSource.setPassword("mJGet66WTn76N8Zr");
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) throws SQLException {
        return new JdbcTemplate(dataSource);
    }
    @Bean
    //创建事务管理器
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
