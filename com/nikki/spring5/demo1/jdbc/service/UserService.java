package com.nikki.spring5.demo1.jdbc.service;

import com.nikki.spring5.demo1.aopanno.User;
import com.nikki.spring5.demo1.jdbc.dao.UserDao;
import com.nikki.spring5.demo1.jdbc.dao.UserDaoImpl;
import com.nikki.spring5.demo1.jdbc.entity.T_Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//开启事务
//参数含义
//propagation:事务传播行为;isolation:事务隔离级别;timeout:超时时间;readOnly:是否只读;
//rollbackFor:回滚;noRollbackFor:不回滚
//@Nullable注解:可以加在方法、属性、参数上边分别表示，方法、属性、参数可以为空

@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;
    public void demo(){
        //转账，多钱少钱
        userDao.reduce(new T_Account("tom",100));
        int a = 10/0;
        userDao.increase(new T_Account("lucy",100));
    }
}
