package com.tdd.practice.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void TestAccount(){
        Account account = new Account();
        assertNotNull(account,"계좌 생성이 실패했습니다.");

    }

    @Test
    public void TestAccount_Balance(){
        Account account = new Account(10000);
        assertEquals(10000, account.getBalance());
    }
}
