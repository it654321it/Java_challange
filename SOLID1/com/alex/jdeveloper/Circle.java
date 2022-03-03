package com.alex.jdeveloper;

public class Circle extends Shape {
    private double radius;
    
    public Circle(double someRadius) {
        radius = someRadius;
    }
    
    public double calcShapeArea() {
        return radius * radius * 3.14;
    }
}
