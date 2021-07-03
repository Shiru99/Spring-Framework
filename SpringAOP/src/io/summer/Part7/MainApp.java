package io.summer.Part7;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import io.summer.Part7.service.ShapeService;

public class MainApp {
    public static void main(String[] args) {
        
        var ctx = new ClassPathXmlApplicationContext("io/summer/Part7/spring.xml");

        ShapeService shapeService =  ctx.getBean("shapeService",ShapeService.class);

        System.out.println(" --- ");
        shapeService.getCircle().setName("वर्तुलम्");
        String str = shapeService.getCircle().getName();
        System.out.println(str);

        ctx.close();
    }
}