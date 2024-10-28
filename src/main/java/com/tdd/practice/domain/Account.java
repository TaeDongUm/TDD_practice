package com.tdd.practice.domain;

public class Account {

    private int money;

    public Account(){}

    public Account(int money){
        this.money = money;
    }

    public int getBalance() {
        return money;
    }
}
