package edu.uncc.factory;

public abstract class AbstarctShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
}

class RectFactory extends AbstarctShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}


class CircleFactory extends AbstarctShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}

class LineFactory extends AbstarctShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Line();
    }
}