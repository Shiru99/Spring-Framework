package io.summer.Part4.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @After("args(name)")
    public void stringArgMethods(String name) {
        System.out.println("This method takes String as argument. Value of string-arg - "+name);
    }
    
    @AfterReturning("args(name)")
    public void successfulExecution(String name) {
        System.out.println("Successful ! This method takes String as argument. Value of string-arg - "+name);
    }

    @AfterThrowing("args(name)")
    public void unsuccessfulExecution(String name) {
        System.out.println("UN-Successful ! This method takes String as argument. Value of string-arg - "+name);
    }
    
}

