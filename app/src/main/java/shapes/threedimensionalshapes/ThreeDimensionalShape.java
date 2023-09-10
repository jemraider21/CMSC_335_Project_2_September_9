package shapes.threedimensionalshapes;

import javafx.scene.image.Image;
import shapes.IShape;

/**
 * File name: ThreeDimensionalShape.java
 * Name: Jared Morris
 * Purpose: A skeleton class used to define the getVolume() method that its
 * children classes must inherit
 */
public abstract class ThreeDimensionalShape extends IShape {

    public ThreeDimensionalShape(int numberOfSides, Image shapImage) {
        super(numberOfSides, shapImage);
    }

    abstract public double getVolume();
}