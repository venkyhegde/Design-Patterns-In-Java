package io.github.venkyhegde.factory.staticcreator;


public class ShapeFactory {

    /**
     * Factory method to get specified shape
     * @param shapeType
     * @return
     */
    public static Shape getShape(String shapeType){
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
