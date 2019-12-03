package edu.uncc.adapter.objectad;

// this is the target interface.
// the implementation of this interface calculates the area of Rectangle.
public interface ICalculator {
    double getArea(Rectangle rectangle);
}
// this is the adaptee class.
class Calculator implements ICalculator{
    Rectangle rectangle;

    public double getArea(Rectangle rectangle){
        this.rectangle = rectangle;
        return this.rectangle.width * this.rectangle.length;
    }
}
