package io.summer.Part6.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("@annotation(io.summer.Part6.aspect.CustomAdviceAnnotation)")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        Object returnObject = null;
        try {
            System.out.println("Before");
            returnObject =  proceedingJoinPoint.proceed();
            if (returnObject != null) {
                System.out.println("Return Object - "+returnObject);
            }
            System.out.println("After");
        } catch (Throwable e) 
        {
            System.out.println("AfterThrowing");
            e.printStackTrace();
        }
        System.out.println("AfterReturning");
        return returnObject;
    }
}