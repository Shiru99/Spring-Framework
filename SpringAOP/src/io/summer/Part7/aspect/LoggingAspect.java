package io.summer.Part7.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Around("allCircleMethods(name)")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint,String name) {
        
        Object returnValue = null;
        try {
            System.out.println("Before");
            returnValue = proceedingJoinPoint.proceed();  
            System.out.println("After");
        } catch (Throwable e) {
            System.out.println("AfterThrowing");
            e.printStackTrace();
        } 
        System.out.println("AfterReturning");
        return returnValue;
    }

    @Pointcut("args(name)")
    public void allCircleMethods(String name) { }
}

