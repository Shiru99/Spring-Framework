package io.summer.Part3;

public class Triangle {

    int longestSide;
    String typeOfTriangle;

    public Triangle(int longestSide) {
        this.longestSide = longestSide;
    }

    public Triangle(String typeOfTriangle) {
        this.typeOfTriangle = typeOfTriangle;
    }

    public Triangle(int longestSide, String typeOfTriangle) {
        this.longestSide = longestSide;
        this.typeOfTriangle = typeOfTriangle;
    }

    public void draw() {
        System.out.println("Drawing "+this.typeOfTriangle+" Triangle with longest side - "+this.longestSide);
    }
}