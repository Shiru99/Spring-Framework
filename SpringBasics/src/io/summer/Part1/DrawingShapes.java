package io.summer.Part1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingShapes {
    public static void main(String[] args) {

        // Triangle triangle = new Triangle();
        // triangle.draw();

        FileSystemResource resource = new FileSystemResource("src/io/summer/Part1/spring.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Triangle triangle = (Triangle) beanFactory.getBean("triangle");

        triangle.draw();

    }
}
