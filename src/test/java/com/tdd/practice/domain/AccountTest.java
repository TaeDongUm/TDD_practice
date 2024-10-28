package com.tdd.practice.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testAccount(){
        Account account = new Account();
        assertNotNull(account,"계좌 생성이 실패했습니다.");

    }
}
