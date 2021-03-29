package com.nikki.spring5.demo1.jdbc.dao;

import com.nikki.spring5.demo1.jdbc.JdbcConfig;
import com.nikki.spring5.demo1.jdbc.entity.Rhesis;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Repository(value = "bookDaoImpl")
public class BookDaoImpl implements BookDao{
    //注入jdbcTemplate
    @Resource(name = "dataSource")
    DataSource dataSource;
    @Autowired
    JdbcConfig jdbcConfig;
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Override
    public int select() {
        String sql = "SELECT COUNT(*) FROM rhesis";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public Rhesis selectForId(Integer id) {
        String sql = "SELECT * FROM rhesis WHERE rhesis_id = ?";
        Rhesis rhesis = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Rhesis>(Rhesis.class), id);
        return rhesis;
    }

    @Override
    public List<Rhesis> selectAll() {
        String sql = "SELECT * FROM rhesis";
        List<Rhesis> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Rhesis>(Rhesis.class));
        return query;
    }

}
