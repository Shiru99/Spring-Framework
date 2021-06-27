package io.summer.Part7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("io/summer/Part7/spring.xml");

        Triangle scalarTriangle = (Triangle) applicationContext.getBean("ScalarTriangle");
        Triangle scalarTriangle0 = (Triangle) applicationContext.getBean("ScalarTriangle");  
        /*
            scalarTriangle0 & scalarTriangle are same objects as 'scope = singleton' 
            
            so it's calling p2-pointC only once ==> though pointC is having scope=prototype both scalarTriangle & scalarTriangle0 have same pointC object
        */
        
        Triangle scalarTriangleNew = (Triangle) applicationContext.getBean("ScalarTriangleNew");

        scalarTriangle.draw();          // P1 : (0,0)      P2 : (13,17)    P3 : (11,19)
        scalarTriangle0.draw();         // P1 : (0,0)      P2 : (13,17)    P3 : (11,19)
        scalarTriangleNew.draw();       // P1 : (11,19)    P2 : (13,17)    P3 : (7,13)

        System.out.println("Updating co-ordinates :");
        scalarTriangle.p2.setX(-99);
        scalarTriangle.p2.setY(-99);

        scalarTriangle.draw();          // P1 : (0,0)      P2 : (-99,-99)  P3 : (11,19)
        scalarTriangle0.draw();         // P1 : (0,0)      P2 : (-99,-99)  P3 : (11,19)
        scalarTriangleNew.draw();       // P1 : (11,19)    P2 : (13,17)    P3 : (7,13)
        
        ((AbstractApplicationContext) applicationContext).close();
    }
}