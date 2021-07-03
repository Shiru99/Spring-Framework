package io.summer.Part6.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("args(name)")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint,String name) {
        
        Object returnValue = null;
        try {
            System.out.println("Before");
            returnValue = proceedingJoinPoint.proceed();  // execute the target method 
            // (Around makes target method execution optional)
            System.out.println("After");
        } catch (Throwable e) {
            System.out.println("AfterThrowing");
            e.printStackTrace();
        } 
        System.out.println("AfterReturning");
        returnValue = "Dummy Value";
        return returnValue;
    }

}