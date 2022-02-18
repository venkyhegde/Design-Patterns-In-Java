package io.github.venkyhegde.adapter.classad;

/**
 * In Object adapter, an adapter implements the target interface and composed (using composition) adaptee.
 * In Class adapter, an adapter implements the target interface and extends the adaptee.
 * This demonstrates, Composition vs Inheritance.
 */
public class Client {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        System.out.println("Duck -");
        duck.quack();
        duck.fly();

        // adapting turkey to duck
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter();
        System.out.println("Turkey Adapter -");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
