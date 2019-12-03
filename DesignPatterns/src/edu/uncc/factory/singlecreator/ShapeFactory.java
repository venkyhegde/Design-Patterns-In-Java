package edu.uncc.factory.singlecreator;

// this is the most common way of factory pattern.
public class ShapeFactory {

    /**
     * This is the factory to return shape objects
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        if(shapeType == null)
            return null;

        if(shapeType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("line"))
            return new Line();

        return null;
    }


}

