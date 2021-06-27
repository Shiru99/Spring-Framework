package io.summer.Part10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("io/summer/Part10/spring.xml");

        applicationContext.registerShutdownHook();
        /*  used to shut down IoC container in non-web applications */

        Triangle scalarTriangle1 = (Triangle) applicationContext.getBean("ScalarTriangle");
        scalarTriangle1.draw();

        applicationContext.close();
    }
}