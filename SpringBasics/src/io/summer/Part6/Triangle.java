package io.summer.Part6;

public class Triangle {

    private Point pointA,pointB,pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
       System.out.print("P1 : ");
       pointA.pointDetails();
       System.out.print("P2 : ");
       pointB.pointDetails();
       System.out.print("P3 : ");
       pointC.pointDetails();
       System.out.println();
    }
}