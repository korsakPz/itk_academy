package com.geometry.example.utils;

import com.geometry.example.shapes.Circle;
import com.geometry.example.shapes.Rectangle;

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
