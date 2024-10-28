package com.tdd.practice.domain;

public class AccountTest {

    public void testAccount(){
        Account account = new Account();
        if(account == null){
            throw new IllegalArgumentException("계좌 생성이 실패했습니다.");
        }
    }
}
