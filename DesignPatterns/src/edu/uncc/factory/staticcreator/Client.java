package edu.uncc.factory.staticcreator;

public class Client {
    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape("circle");
        Shape rect = ShapeFactory.getShape("rectangle");

        circle.draw();
        rect.draw();
    }
}
