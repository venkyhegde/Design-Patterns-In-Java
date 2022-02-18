package io.github.venkyhegde.factory.singlecreator;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        Shape rect = shapeFactory.getShape("rectangle");

        circle.draw();
        rect.draw();
    }
}
