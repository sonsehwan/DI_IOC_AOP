package com.example.di_ioc_aop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class MessageService {

    private final MessageRepository messageRepository;

    @LogExecution
    public void printMessage() {
        System.out.println("[Service] 비즈니스 로직 실행 중...");
        System.out.println("결과: " + messageRepository.getMessage());
    }
}
