package com.example.app;

import com.example.geometry.shapes.Rectangle;
import com.example.geometry.shapes.Circle;
import com.example.geometry.shapes.Triangle;
import com.example.geometry.utils.GeometryUtils;

public class Main {


    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("=== Geometry Figures ===");
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());

        System.out.println("Comparison: " + GeometryUtils.compareArea(circle, rectangle));
        System.out.println(circle.getInfo); //==================
    }
}
