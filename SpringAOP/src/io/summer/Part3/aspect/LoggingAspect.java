package io.summer.Part3.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void advice() {
        System.out.println("Advice run. circle method called");
    }
    
    @Pointcut("within(io.summer.Part3.model.Circle)")
    public void allCircleMethods() { }

    
}

