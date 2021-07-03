package io.summer.Part7.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

// @Aspect  -   <aop:aspect/>
public class LoggingAspect {

    // @Around("methodWithArg(name)") - <aop:around method="myAroundAdvice" pointcut-ref="methodWithArg" />
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

    /* 
        @Pointcut("args(name)")     -   <aop:pointcut id="methodWithArg" expression="args(name)"/>
        public void methodWithArg(String name){}
    */
}

