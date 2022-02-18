package io.github.venkyhegde.decorator.ex3;

public class Client {

    public static void main(String[] args) {
        Shape rect = new Rectangle();
        rect.draw();

        Shape circle = new Circle();
        circle.draw();
        System.out.println("*****************************");
        // adding decorators
        ShapeDecorator rectDeco = new RectDecorator(rect);
        rectDeco.draw();
        System.out.println("------------------------------");
        ShapeDecorator circleDeco = new CircleDecorator(circle);
        circleDeco.draw();
    }

}
