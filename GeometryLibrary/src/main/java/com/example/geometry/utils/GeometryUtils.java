package com.example.geometry.utils;

import com.example.geometry.shapes.Circle;
import com.example.geometry.shapes.Rectangle;

public class GeometryUtils {


    public static String compareArea(Circle circle, Rectangle rectangle) {
        double circleArea = circle.getArea();
        double rectangleArea = rectangle.getArea();

        if (circleArea > rectangleArea) {
            return "Circle has larger area";
        } else if (circleArea < rectangleArea) {
            return "Rectangle has larger area";
        } else {
            return "Areas are equal";
        }
    }

    public static double convertToSquareMeters(double squareCentimeters) {
        return squareCentimeters / 10000;
    }



}
