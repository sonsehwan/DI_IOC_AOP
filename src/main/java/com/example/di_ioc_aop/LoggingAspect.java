package com.example.di_ioc_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Around("@annotation(LogExecution)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        System.out.println(">>> [AOP 로그] 시작: " + className + "의 " + methodName + "() 실행");

        Object result = joinPoint.proceed();

        System.out.println(">>> [AOP 로그] 종료: " + className + " 실행 완료");
        return result;
    }
}
