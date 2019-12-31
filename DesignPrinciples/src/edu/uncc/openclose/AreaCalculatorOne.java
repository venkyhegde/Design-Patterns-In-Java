package edu.uncc.openclose;

/**
 * This area calculator has issue, every time a new shape is added, a new method needs to be added for this class,
 * that's modification. However, the scope of the area calculator is not extended.
 */
public class AreaCalculatorOne {
    final static double PI = (22/7);
    public double calculateRectArea(RectangleOne rectangle){
        return rectangle.getLength() * rectangle.getWidth();
    }

    public double calculateCircleArea(CircleOne circle){

        return PI * circle.getRadius() * circle.getRadius();
    }
}

class RectangleOne{
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
}

class CircleOne {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}