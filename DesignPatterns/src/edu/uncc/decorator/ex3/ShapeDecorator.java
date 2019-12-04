package edu.uncc.decorator.ex3;

public interface ShapeDecorator extends Shape {

}

class RectDecorator implements ShapeDecorator{
    Shape shape;
    public RectDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        System.out.println("Adding Border Color to Rectangle");
        shape.draw();
        System.out.println("Filling the Rectangle");
    }
}

class CircleDecorator implements ShapeDecorator{
    Shape shape;
    public CircleDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        System.out.println("Adding Border Color to Circle");
        shape.draw();
        System.out.println("Filling the Circle");
    }
}