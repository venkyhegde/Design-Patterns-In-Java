package edu.uncc.interfaceseg.shape;

public interface ShapeInterface {

    double area();
    double volume();
}

/**
 * This interface has a problem . Suppose all shapes going to implement this interface they must procide
 * implementation to both the methods. However, square's/ any rectangles don't have the volume. This violates the
 * interface segregation.
 */
