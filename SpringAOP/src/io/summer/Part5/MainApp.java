package io.summer.Part5;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import io.summer.Part5.service.ShapeService;

public class MainApp {
    public static void main(String[] args) {
        
        var ctx = new ClassPathXmlApplicationContext("io/summer/Part5/spring.xml");

        ShapeService shapeService =  ctx.getBean("shapeService",ShapeService.class);

        System.out.println(" --- ");
        shapeService.getCircle().setNameReturns("वर्तुलम्");
        System.out.println(shapeService.getCircle().getName());

        ctx.close();
    }
}