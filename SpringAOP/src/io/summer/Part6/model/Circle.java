package io.summer.Part6.model;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setNameReturns(String name) {
        System.out.println("Setting circle name - "+name);
        this.name = name;
        // throw(new RuntimeException());
        return name;
    }
}
