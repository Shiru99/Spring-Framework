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

    // @AfterThrowing("args(name)")
    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void unsuccessfulExecution(String name,RuntimeException ex) {
        System.out.println("UN-Successful : "+ex);
    }


    @AfterReturning(pointcut="args(name)",returning = "returnString")
    public void stringArgMethodReturnObject(String name,String returnString) {
        // returnString = "dummy Value";   // local variable no effect on return Object
        System.out.println("Return value : "+returnString);
    }
    
}

