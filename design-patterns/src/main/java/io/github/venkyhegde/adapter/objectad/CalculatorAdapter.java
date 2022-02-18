package io.github.venkyhegde.adapter.objectad;

/**
 * This is an adapter class which targets ICalculator which calculates only
 */
public class CalculatorAdapter implements ICalculator {
    Calculator calculator; // adaptee. Rectangle calculator being adapted as triangle calculator
    Triangle triangle;

    public CalculatorAdapter(Triangle t){
        this.triangle = t;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();
        rectangle = new Rectangle();
        // converting triangle
        rectangle.length = triangle.base;
        rectangle.width = 0.5 * triangle.height;

        return calculator.getArea(rectangle);
    }
}
