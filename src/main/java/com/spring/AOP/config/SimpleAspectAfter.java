package com.spring.AOP.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
@Aspect
@Component
public class SimpleAspectAfter {

    @Before("@within(com.spring.AOP.annotation.LogExecution) || @annotation(com.spring.AOP.annotation.LogExecution)")
    // @Before("@annotation(com.spring.AOP.annotation.LogExecution)")
     //@AfterReturning("@annotation(com.spring.AOP.annotation.LogExecution)")
     //@Around("@annotation(com.spring.AOP.annotation.LogExecution)")
    public void log(JoinPoint joinPoint) throws Throwable {
        Object requestBody = joinPoint.getArgs()[0];
        Class<?> clazz = requestBody.getClass();
        System.out.println("Aspect is executed before the service method. Request body class: " + clazz.getName());

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(requestBody);
                System.out.println(field.getName() + " = " + value);
            } catch (IllegalAccessException e) {
                System.err.println("Error accessing field: " + field.getName() + " - " + e.getMessage());
            }
        }
//        Object obj=joinPoint.proceed();
//       System.out.println("example for proceed ");
    }
}