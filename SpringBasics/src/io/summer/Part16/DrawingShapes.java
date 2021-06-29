package io.summer.Part16;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("io/summer/Part16/spring.xml");
        
        Shape shape = (Shape) applicationContext.getBean("circle");
        shape.draw();

        // MessageSource : Extra functionality of ApplicationContext over BeanFactory

        // M-1 (using ApplicationContext)
        System.out.println(
            applicationContext.getMessage(
                "greetings-EN",         // name of property
                null,                   // list of objects for parameterized message
                "Default Greetings",    // default property value
                Locale.ENGLISH          // locale
            )
        );

        System.out.println(
            applicationContext.getMessage(
                "greetings-ITL",         // name of property
                null,                   // list of objects for parameterized message
                "Default Greetings",    // default property value
                Locale.ITALIAN
            )
        );


        ((AbstractApplicationContext) applicationContext).close();
    }
}