package io.summer.Part8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.summer.Part8.model.Circle;
import io.summer.Part8.service.FactoryService;
import io.summer.Part8.service.ShapeService;

public class MainApp {
    public static void main(String[] args) {
        
        // var ctx = new ClassPathXmlApplicationContext("io/summer/Part8/spring.xml");
        // ShapeService shapeService =  ctx.getBean("shapeService",ShapeService.class);

        FactoryService factoryService = new FactoryService();
        ShapeService shapeService =  (ShapeService) factoryService.getBean("shapeService");

        shapeService.setCircle((Circle)factoryService.getBean("circle"));
        shapeService.getCircle().setName("वर्तुलम्");
        
        System.out.println(shapeService.getCircle().getName());
    }
}