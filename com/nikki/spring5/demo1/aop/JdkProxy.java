package com.nikki.spring5.demo1.aop;

import java.lang.reflect.Proxy;

public class JdkProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), interfaces, new UserProxy(userDao));
        int result = dao.add(4, 5);
        System.out.println(result);
    }
}
