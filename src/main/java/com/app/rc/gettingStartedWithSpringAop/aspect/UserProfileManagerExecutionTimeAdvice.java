package com.app.rc.gettingStartedWithSpringAop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Configuration
public class UserProfileManagerExecutionTimeAdvice {

  @Around("@annotation(com.app.rc.gettingStartedWithSpringAop.aspect.LogExecutionTime)")
  public Object logExecutionTimePointCut(ProceedingJoinPoint joinPoint) throws Throwable {
    long start = System.currentTimeMillis();

    Object proceed = joinPoint.proceed();

    long executionTime = System.currentTimeMillis() - start;

    log.info("{} executed in {} ms", joinPoint.getSignature(), executionTime);
    return proceed;
  }
}
