package com.nikki.spring5.demo1.jdbc.dao;

import com.nikki.spring5.demo1.jdbc.entity.T_Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public boolean increase(T_Account t_account) {
        String sql = "UPDATE t_account SET money = money + ? WHERE username = ?";
        int update = jdbcTemplate.update(sql, t_account.getMoney(), t_account.getUsername());
        return update>0;
    }

    @Override
    public boolean reduce(T_Account t_account) {
        String sql = "UPDATE t_account SET money = money - ? WHERE username = ?";
        int update = jdbcTemplate.update(sql, t_account.getMoney(), t_account.getUsername());
        return update>0;
    }
}
