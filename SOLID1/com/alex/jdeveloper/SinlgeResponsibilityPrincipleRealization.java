package com.alex.jdeveloper;

public class SinlgeResponsibilityPrincipleRealization {
    public static void main(String[] args) {
        System.out.println("This App demonstrates realization of 'Single Responsibility' principle.");    
        
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(5, 3);
        
        Shape[] shapesArray =  new Shape[2];
        shapesArray[0] = circle;
        CalcAnyArea ca = new CalcAnyArea(shapesArray);
        OutputAreaToConsole output = new OutputAreaToConsole(ca.calcOneArea());
        
        System.out.print("Circle: ");
        output.console();
        
        shapesArray[0] = rectangle;
        output.area = ca.calcOneArea(); 
        
        System.out.print("Rectangle: ");
        output.console();
        
        shapesArray[1] = circle;
        output.area = ca.sumAreas();
        
        System.out.print("Circle and Rectangle: ");
        output.console();
        System.out.println();
        System.out.println("Area of all shapes in HTML view: ");
        output.htmlOutput();
    }
}
