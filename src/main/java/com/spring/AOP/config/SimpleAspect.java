package com.spring.AOP.config;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class SimpleAspect {
//
//    @Before("execution(public void com.spring.AOP.controller.SimpleController.serve(..))")
//    public void log(JoinPoint joinPoint) {
//        // Get the method arguments
//        Object[] args = joinPoint.getArgs();
//        if (args != null && args.length > 0) {
//            // Assuming the first argument is the 'name' parameter
//            String name = (String) args[0];
//            System.out.println("Aspect is executed for logging before the service method. Name: " + name);
//        } else {
//            System.out.println("Aspect is executed, but no arguments were found.");
//        }
//    }
//}
