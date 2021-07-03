package io.summer.Part3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import io.summer.Part3.service.ShapeService;

public class MainApp {
    public static void main(String[] args) {
        
        var ctx = new ClassPathXmlApplicationContext("io/summer/Part3/spring.xml");

        ShapeService shapeService =  ctx.getBean("shapeService",ShapeService.class);

        System.out.println(" --- ");
        String str = shapeService.getCircle().getName();
        System.out.println(str);
        
        ctx.close();
    }
}