package com.alex.jdeveloper;

public class CalcAnyArea {
    Shape[] shapes;
    double area = 0;
    
    public CalcAnyArea(Shape[] someShapes){
        shapes = someShapes;
    }
    
    public double calcOneArea() {
        return shapes[0].calcShapeArea();
    }
    
    public double sumAreas() {
        for (int i = 0; i <= shapes.length - 1; i++) {
            area += shapes[i].calcShapeArea();
        }
        return area;
    }
}
