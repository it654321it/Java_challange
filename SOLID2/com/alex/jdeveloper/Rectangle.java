package com.alex.jdeveloper;

public class Rectangle extends Shape {
    private double height;
    private double width;
    
    public Rectangle(double h, double w) {
        height = h;
        width = w;
    }
    
    @Override
    public double getArea() {
        return height * width;
    }
}
