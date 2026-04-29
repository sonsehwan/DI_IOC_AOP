package com.example.di_ioc_aop.game;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Switch {
    private final GameChip gameChip;

    public void startGame(){
        gameChip.play();
    }
}

//@Component
//public class Switch {
//
//    @Autowired
//    private GameChip gameChip;
//
//    public void startGame(){
//        gameChip.play();
//    }
//}
