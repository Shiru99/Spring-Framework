package io.summer.Part2.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("execution(public String getName())")
    public void advice0() {
        System.out.println("Advice run. getName() method called");
    }

    @After("execution(public String getName())")
    public void advice1() {
        System.out.println("Advice run. getName() method finished");
    }

    // For particular class method
    @Before("execution(public String io.summer.Part2.model.Circle.getName())")
    public void advice2() {
        System.out.println("Advice run. getName() method of Circle called");
    }

    // Wildcard - * ( * - can be replaced by any thing)
    @Before("execution(public * get*())")   // no argument
    public void advice3() {
        System.out.println("Advice run. get method called");
    }

    @Before("execution(public * get*(*))")  // * - atleast one argument 
    public void advice4() {
        System.out.println("Advice run. get method with argument called");
    }

    @Before("execution(public * get*(..))")  // * - 0 or more argument 
    public void advice5() {
        System.out.println("Advice run. set method with or without argument called");
    }

    /* Pointcuts */

    // @Before("execution(public String getName())")
    @Before("allGetters()")
    public void FirstAdvice() {
        System.out.println("FirstAdvice : getName() method called");
    }

    // @Before("execution(public String getName())")
    @Before("allGetters()")
    public void SecondAdvice() {
        System.out.println("SecondAdvice : getName() method called");
    }

    @Pointcut("execution(public String getName())")
    public void allGetters() {
        // Dummy Method - 5this code never get executed
    }

    /* More about Pointcuts */ 


    // @Pointcut("execution(* * io.summer.Part2.model.Circle.*(..))")
    @Pointcut("within(io.summer.Part2.model.Circle)")
    public void allCircleMethods() { }

    @Pointcut("within(io.summer.Part2.model.*)")
    public void allMethodsInEachPackage() { }

    @Pointcut("within(io.summer.Part2.model..*)")
    public void allMethodsOfEachPackageAndSubPackage() { }

    @Before("allGetters() && allCircleMethods()") // logical && 
    public void ThirdAdvice() {
        System.out.println("FirstAdvice : getName() method called");
    }
}

