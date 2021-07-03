package io.summer.Part3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import io.summer.Part3.model.Circle;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void advice(JoinPoint joinPoint) {
        System.out.println(joinPoint.toLongString());
        System.out.println(joinPoint.toString());
        System.out.println(joinPoint.toShortString());

        Circle circle = (Circle) joinPoint.getTarget();
        System.out.println(circle);
        System.out.println("Advice run : circle method called");
    }

    @Pointcut("within(io.summer.Part3.model.Circle)")
    public void allCircleMethods() { }


    // Advice arguments

    // @Before("args(String)")
    // public void stringArgMethods() {
    //     System.out.println("This method takes String as argument");
    // }

    @Before("args(name)")
    public void stringArgMethods(String name) {
        System.out.println("This method takes String as argument. Value of string-arg - "+name);
    }
    
}

