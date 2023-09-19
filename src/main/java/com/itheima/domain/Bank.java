package com.itheima.domain;

public class Bank {
    private int id;

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", money=" + money +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String account;
    private int money;

    // 无参构造函数
    public Bank() {
    }

    // 带参构造函数
    public Bank(String account, int money) {
        this.account = account;
        this.money = money;
    }

    // Getter和Setter方法
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
