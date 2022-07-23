package com.zaurtregulov.spring.mvc_hibernate_aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* com.zaurtregulov.spring.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getName();

        System.out.println("*********" + "\u001B[34m" + "Begin of " + methodName + "\u001B[0m" + "*********");
        Object result = joinPoint.proceed();
        System.out.println("*********" + "\u001B[34m" + "End of " + methodName + "\u001B[0m" + "*********");
        System.out.println();
        return result;
    }
}
