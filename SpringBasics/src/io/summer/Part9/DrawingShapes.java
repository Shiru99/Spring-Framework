package io.summer.Part9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("io/summer/Part9/spring.xml");

        Triangle scalarTriangle1 = (Triangle) applicationContext.getBean("ScalarTriangle1");
        scalarTriangle1.draw();

        Triangle scalarTriangle2 = (Triangle) applicationContext.getBean("ScalarTriangle2");
        scalarTriangle2.draw();

        Polygon polygon = (Polygon) applicationContext.getBean("polygon");
        System.out.print("Polygon :\t");
        polygon.draw();

        ((AbstractApplicationContext) applicationContext).close();
    }
}