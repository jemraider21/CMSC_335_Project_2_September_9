package shapes.twodimensionalshapes;

import javafx.scene.image.Image;
import shapes.IShape;

/**
 * File name: TwoDimensionalShape.java
 * Name: Jared Morris
 * Purpose: A skeleton class used to define the getArea() method that its
 * children classes must inherit
 */
public abstract class TwoDimensionalShape extends IShape {

    protected TwoDimensionalShape(int numberOfSides, Image shapeImage) {
        super(numberOfSides, shapeImage);
    }

    public abstract double getArea();
}