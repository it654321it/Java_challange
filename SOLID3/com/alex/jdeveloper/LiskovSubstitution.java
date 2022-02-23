package com.alex.jdeveloper;

// simple demonstration of 3rd SOLID principle - Liskov Substitution
public class LiskovSubstitution {
    public static void main(String[] args) {
        System.out.println("Liskov Substitution app starts.");
        
        Rectangle r = new Rectangle(2, 3);
        System.out.println("Area of rectangle: " + r.calcFigureArea());
        
        Square s = new Square(10);
        System.out.println("Area of square: " + s.calcFigureArea());
    }
}

