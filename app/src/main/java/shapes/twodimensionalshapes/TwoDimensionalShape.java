package shapes.twodimensionalshapes;

import shapes.Shape;

/**
 * File name: TwoDimensionalShape.java
 * Name: Jared Morris
 * Purpose: A skeleton class used to define the getArea() method that its
 * children classes must inherit
 */
public abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape(int numberOfSides) {
        super(numberOfSides);
    }

    abstract public double getArea();
}