package com.example.geometry.shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {

        return radius;
    }

    public String getInfo() {

        return String.format("Circle: radius=%.2f, area=%.2f, perimeter=%.2f",
                radius, getArea(), getPerimeter());
    }
}
