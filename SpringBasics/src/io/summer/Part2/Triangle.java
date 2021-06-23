package io.summer.Part2;

public class Triangle {
    String typeOfTriangle;
    
    public String getTypeOfTriangle() {
        return typeOfTriangle;
    }

    public void setTypeOfTriangle(String typeOfTriangle) {
        this.typeOfTriangle = typeOfTriangle;
    }

    public void draw() {
        System.out.println("Drawing "+getTypeOfTriangle()+" Triangle");
    }
    
}