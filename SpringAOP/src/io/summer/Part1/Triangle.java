package io.summer.Part1;

public class Triangle extends Shape {

    String shapeType = "Triangle";

    Point p1, p2, p3;

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
        System.out.println("Drawing Triangle");
        System.out.print("P1 : ");
        p1.pointDetails();
        System.out.print("P2 : ");
        p2.pointDetails();
        System.out.print("P3 : ");
        p3.pointDetails();
        System.out.println();
    }

   
}
