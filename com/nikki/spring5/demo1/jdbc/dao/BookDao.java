package com.nikki.spring5.demo1.jdbc.dao;

import com.nikki.spring5.demo1.jdbc.entity.Rhesis;

import java.util.List;

public interface BookDao {
    public int select();
    public Rhesis selectForId(Integer id);
    public List<Rhesis> selectAll();
}
