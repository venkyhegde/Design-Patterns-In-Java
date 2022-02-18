package io.github.venkyhegde.decorator.ex1;

public class Main {

    public static void main(String[] args) {
        // creating concrete component
        ConcreteComponent component = new ConcreteComponent();

        // creating decorator for this object
        ConcreteDecorator cd = new ConcreteDecorator(component);
        cd.mainTask();

        NewConcreteDecorator nCd = new NewConcreteDecorator(component);
        nCd.mainTask();

    }
}
