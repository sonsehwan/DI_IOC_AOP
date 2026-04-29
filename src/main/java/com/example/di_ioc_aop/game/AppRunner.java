package com.example.di_ioc_aop.game;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    private final Switch nintendoSwitch;

    @Override
    public void run(ApplicationArguments args){
        System.out.println("\n--- 닌텐도 스위치 구동 ---");
        nintendoSwitch.startGame();
        System.out.println("--- 전원 종료 ---\n");
    }
}
