package io.summer.Part4;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import io.summer.Part4.service.ShapeService;

public class MainApp {
    public static void main(String[] args) {
        
        var ctx = new ClassPathXmlApplicationContext("io/summer/Part4/spring.xml");

        ShapeService shapeService =  ctx.getBean("shapeService",ShapeService.class);

        System.out.println(" --- ");
        shapeService.getCircle().setName("वर्तुलम्");

        ctx.close();
    }
}