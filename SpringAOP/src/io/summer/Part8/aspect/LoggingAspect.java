package io.summer.Part8.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(public String getName())")
    public void advice0() {
        System.out.println("Advice run. Get method called");
    }

    @After("execution(public String getName())")
    public void advice1() {
        System.out.println("Advice run. Get method finished");
    }
}
