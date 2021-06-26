package io.summer.Part4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("io/summer/Part4/spring.xml");

        Triangle scalarTriangle = (Triangle) applicationContext.getBean("ScalarTriangle");
        scalarTriangle.draw();

        Triangle scalarTriangle0 = (Triangle) applicationContext.getBean("SecondScalarTriangle");
        scalarTriangle0.draw();

        System.out.println("Updating co-ordinates :");
        scalarTriangle.p2.setX(-99);
        scalarTriangle.p2.setY(-99);
        scalarTriangle.draw();
        scalarTriangle0.draw();
        
        ((AbstractApplicationContext) applicationContext).close();
    }
}