package com.nikki.spring5.demo1.jdbc.service;

import com.nikki.spring5.demo1.jdbc.dao.BookDao;
import com.nikki.spring5.demo1.jdbc.entity.Rhesis;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookService {
    //注入Dao
    @Resource(name = "bookDaoImpl")
    private BookDao bookDao;
    //查询方法
    public int select(){
        return bookDao.select();
    }
    public Rhesis selectForID(){
        return bookDao.selectForId(1);
    }
    public List<Rhesis> selectAll(){
        return bookDao.selectAll();
    }
}
