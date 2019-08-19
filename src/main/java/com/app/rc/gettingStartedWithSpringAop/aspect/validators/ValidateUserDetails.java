package com.app.rc.gettingStartedWithSpringAop.aspect.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TODO: Implement Validators ti be used with AOP
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateUserDetails {

  String expression() default ".*";

  String message() default "User Details cannot be validated!";
}