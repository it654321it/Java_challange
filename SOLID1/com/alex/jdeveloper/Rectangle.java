package com.alex.jdeveloper;

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double someWidth, double someHeight) {
        width = someWidth;
        height = someHeight;
    }
    
    public double calcShapeArea() {
        return width * height;
    }
}
