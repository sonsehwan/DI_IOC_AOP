package com.example.di_ioc_aop.game;

import com.example.di_ioc_aop.LogExecution;
import org.springframework.stereotype.Component;

@Component
public class Pokemon implements GameChip{

    @Override
    @LogExecution
    public void play(){
        System.out.println("포켓몬 게임을 시작합니다!! 시작 포켓몬을 고르세요.");
    }
}
