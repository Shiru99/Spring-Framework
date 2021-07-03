package io.summer.Part4.model;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting circle name - "+name);
        this.name = name;
        throw(new RuntimeException());
    }

    public String setNameReturns(String name) {
        System.out.println("Setting circle name - "+name);
        this.name = name;
        // throw(new RuntimeException());
        return name;
    }
}
