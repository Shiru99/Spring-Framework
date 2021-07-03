package io.summer.Part8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.summer.Part8.service.ShapeService;

public class MainApp {
    public static void main(String[] args) {
        
        var ctx = new ClassPathXmlApplicationContext("io/summer/Part8/spring.xml");
        ShapeService shapeService =  ctx.getBean("shapeService",ShapeService.class);

        

        String str = shapeService.getCircle().getName();
        System.out.println(str);

        System.out.println();
        System.out.println(shapeService.getTriangle().getName());

        ctx.close();
    }
}