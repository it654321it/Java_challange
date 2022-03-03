package com.alex.jdeveloper;

public class OutputAreaToConsole {
    public double area = 0;
    
    public OutputAreaToConsole(double someArea) {
        area = someArea;
    }
    
    public void console() {
        System.out.print("area of shape=" + area);
        System.out.println();
    }
    
    public void htmlOutput() {
        System.out.println("<HTML>");
        System.out.println("Calculated area of all shapes: " + area);
        System.out.println("</HTML>");
    }
}
