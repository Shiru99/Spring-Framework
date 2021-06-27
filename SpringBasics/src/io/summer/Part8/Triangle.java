package io.summer.Part8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

    Point p1, p2, p3;

    ApplicationContext applicationContext = null;
    String beanName = null;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println("Bean name - "+ this.beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        setTriangle();
    }

    void setTriangle(){
        p1 = (Point) applicationContext.getBean("pointA");
        p2 = (Point) applicationContext.getBean("pointB");
        p3 = (Point) applicationContext.getBean("pointC");
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public void draw() {
        System.out.print("P1 : ");
        p1.pointDetails();
        System.out.print("P2 : ");
        p2.pointDetails();
        System.out.print("P3 : ");
        p3.pointDetails();
        System.out.println();
    }
}