package com.alex.jdeveloper;

class Square extends Shape {
    private double side;
    
    public Square(double someSide) {
        side = someSide;
    }
    
    @Override
    public double calcFigureArea() {
        area = side * side;
        return area;
    }
}