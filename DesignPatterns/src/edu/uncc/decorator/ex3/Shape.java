package edu.uncc.decorator.ex3;

// this is the component interface
public interface Shape {
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
