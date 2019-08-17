package com.app.rc.gettingStartedWithSpringAop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Configuration
public class UserProfileManagerAspectForLoggingConfig {

  /**
   * @param joinPoint
   */
  @Before("execution(* com.app.rc.gettingStartedWithSpringAop.persistence.repository.UserProfileRepositoryImpl.*(..))")
  public void beforeUserProfilePointCutDefinition(JoinPoint joinPoint) {
    log.info("Aspect : {}", joinPoint.getSignature());
    log.info("Arguments : {}", joinPoint.getArgs());
  }

  /**
   * @param joinPoint
   */
  @After("execution(* com.app.rc.gettingStartedWithSpringAop.persistence.repository.UserProfileRepositoryImpl.*(..))")
  public void afterUserProfilePointCutDefinition(JoinPoint joinPoint) {
    log.info("Aspect Completed On : {}", joinPoint.getKind() + " " + joinPoint.getSourceLocation());
  }
}