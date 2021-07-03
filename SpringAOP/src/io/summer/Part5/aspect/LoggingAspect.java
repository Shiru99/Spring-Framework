package io.summer.Part5.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingAspect {

    @Before("args(name)")
    public void stringArgMethods(String name) {
        System.out.println("This method takes String as argument. Value of string-arg - "+name);
    }
    
}

