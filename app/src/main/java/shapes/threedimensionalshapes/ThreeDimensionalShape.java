package shapes.threedimensionalshapes;

import shapes.Shape;

/**
 * File name: ThreeDimensionalShape.java
 * Name: Jared Morris
 * Purpose: A skeleton class used to define the getVolume() method that its
 * children classes must inherit
 */
public abstract class ThreeDimensionalShape extends Shape {

    public ThreeDimensionalShape(int numberOfSides) {
        super(numberOfSides);
    }

    abstract public double getVolume();
}