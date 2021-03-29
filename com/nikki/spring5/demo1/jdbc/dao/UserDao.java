package com.nikki.spring5.demo1.jdbc.dao;

import com.nikki.spring5.demo1.jdbc.entity.T_Account;

public interface UserDao {
    public boolean increase(T_Account t_account);
    public boolean reduce(T_Account t_account);
}
