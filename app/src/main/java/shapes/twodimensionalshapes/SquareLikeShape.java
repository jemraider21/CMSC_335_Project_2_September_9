package shapes.twodimensionalshapes;

import javafx.scene.image.Image;

/**
 * File name: SquareLikeShape.java
 * Name: Jared Morris
 * Purpose: A skeleton class used for shapes that need a width and a height
 * defined as properties to calculate its area
 */
public abstract class SquareLikeShape extends TwoDimensionalShape {

    protected double width;
    protected double height;

    protected SquareLikeShape(int numberOfSides, double width, double height, Image shapeImage) {
        super(numberOfSides, shapeImage);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

}