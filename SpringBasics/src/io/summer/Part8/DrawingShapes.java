package io.summer.Part8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("io/summer/Part8/spring.xml");

        Triangle scalarTriangle = (Triangle) applicationContext.getBean("ScalarTriangle");
        Triangle scalarTriangle0 = (Triangle) applicationContext.getBean("ScalarTriangle");

        // ScalarTriangle - scope="singleton" ==> scalarTriangle & scalarTriangle0 - same

        scalarTriangle.draw();      // P1 : (6,6)      P2 : (0,6)      P3 : (6,0)
        scalarTriangle0.draw();     // P1 : (6,6)      P2 : (0,6)      P3 : (6,0)

        System.out.println("Updating co-ordinates :");
        scalarTriangle.p3.setX(-1);
        scalarTriangle.p3.setY(-1);

        scalarTriangle.draw();      // P1 : (6,6)      P2 : (0,6)      P3 : (-1,-1)
        scalarTriangle0.draw();     // P1 : (6,6)      P2 : (0,6)      P3 : (-1,-1)

        ((AbstractApplicationContext) applicationContext).close();
    }
}