package edu.uncc.interfaceseg.shape;

public interface Shape {
    public double area();
}

interface SolidShape{
    double volume();
}

interface ManageShape{
    double calculate();
}

class Rectangle implements Shape, ManageShape{

    @Override
    public double area() {
        //returns the area of this rectangle
        return 0;
    }

    @Override
    public double calculate() {
        //
        return  area();
    }
}

class Cube implements Shape, SolidShape, ManageShape{

    @Override
    public double area() {
        // returns area of this cube
        return 0;
    }

    @Override
    public double volume() {
        // returns volume of this cube
        return 0;
    }

    @Override
    public double calculate() {
        // this can have class specific implementation.
        return area() + volume();
    }
}

/**
 * This is the best way to segregate the functionality.
 */
