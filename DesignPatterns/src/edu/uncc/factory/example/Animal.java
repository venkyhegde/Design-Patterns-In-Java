package edu.uncc.factory.example;

public interface Animal {
    void getName();
}

class Dog implements Animal{
    @Override
    public void getName(){
        System.out.println("The animal Dog");
    }
}

class Tiger implements Animal{

    @Override
    public void getName() {
        System.out.println("The animal Tiger");
    }
}

class Cat implements Animal{
    @Override
    public void getName() {
        System.out.println("The animal Cat");
    }
}