package com.alex.jdeveloper;

class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double someHeight, double someWidth) {
        height = someHeight;
        width = someWidth;
    }

    @Override
    public double calcFigureArea() {
        area = height * width;
        return area;
    }
}
