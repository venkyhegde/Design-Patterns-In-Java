package edu.uncc.adapter.objectad;

// these are examples of composition
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new MallardDuck();

        System.out.println("Duck");
        duck.quack();
        duck.fly();

        // adapting turkey to duck
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("Adapted Turkey");
        turkeyAdapter.quack();
        turkeyAdapter.fly();


        // Calculator
        Triangle t = new Triangle(10, 15);
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter(t);
        System.out.println("Area of Triangle - ");
        System.out.println(calculatorAdapter.getArea(null));

    }
}
