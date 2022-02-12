package com.alex.jdeveloper;

public class OpenClosedPrincple {
    public static void main(String[] args) {
        System.out.println("App will calculate any shape's area (on this moment only Rect&Circle.");
        
        CalcFigureArea ca = new CalcFigureArea();
        
        Rectangle r = new Rectangle(2,3);
        
        System.out.println("Area of entered rectangle= " + ca.calcArea(r));
        
        Circle c = new Circle(5);
        System.out.println("Area of entered circle= " + ca.calcArea(c));
    }
}
