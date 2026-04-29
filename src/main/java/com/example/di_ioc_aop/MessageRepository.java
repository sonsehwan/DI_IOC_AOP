package com.example.di_ioc_aop;

import org.springframework.stereotype.Repository;

@Repository
class MessageRepository {
    public String getMessage() {
        return "스프링의 DI, IoC, AOP가 모두 성공적으로 동작했습니다!";
    }
}