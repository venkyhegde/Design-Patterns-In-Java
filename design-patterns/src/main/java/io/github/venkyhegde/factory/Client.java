package io.github.venkyhegde.factory;

public class Client {
    public static void main(String[] args) {
        // this where factory methods are used to create shapes.
        // This is the most strict implementation of factory method. Tedious :(
        Shape rect = new CircleFactory().getShape();
        rect.draw();

        Shape line = new LineFactory().getShape();
        line.draw();
    }

}
