package io.github.venkyhegde.decorator.ex3;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    public abstract void draw();
}

class RectDecorator extends ShapeDecorator{

    public RectDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Adding Border Color to Rectangle");
        shape.draw();
        System.out.println("Filling the Rectangle");
    }
}

class CircleDecorator extends ShapeDecorator{

    public CircleDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Adding Border Color to Circle");
        shape.draw();
        System.out.println("Filling the Circle");
    }
}