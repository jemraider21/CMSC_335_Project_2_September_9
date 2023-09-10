package shapes.twodimensionalshapes;

import javafx.scene.shape.Shape;
import shapes.IShape;

/**
 * File name: TwoDimensionalShape.java
 * Name: Jared Morris
 * Purpose: A skeleton class used to define the getArea() method that its
 * children classes must inherit
 */
public abstract class TwoDimensionalShape extends IShape {

    private Shape visualShape;

    public TwoDimensionalShape(int numberOfSides, Shape visualShape) {
        super(numberOfSides);
        this.visualShape = visualShape;
    }

    public Shape getVisualShape() {
        return visualShape;
    }

    abstract public double getArea();
}