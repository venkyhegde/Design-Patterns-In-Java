package io.github.venkyhegde.openclose;

interface Shape{
    double calculateArea();
}
class Rectangle implements Shape{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape{
    private final static double PI = 22/7;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}

/**
 * This implementation is closed for modification, but it can be extended to any shape by creating the shape class
 * which implements the shape interface.
 */
public class AreaCalculator {
    public double calculateArea(Shape shape){
        return shape.calculateArea();
    }
}
