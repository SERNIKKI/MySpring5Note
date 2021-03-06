package com.nikki.spring5.demo1.jdbc.entity;

public class T_Account {
    private int id;
    private String username;
    private int money;

    public T_Account(String username, int money) {
        this.username = username;
        this.money = money;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    @Override
    public String toString() {
        return "T_Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}
