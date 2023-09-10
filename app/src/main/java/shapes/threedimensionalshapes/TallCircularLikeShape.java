package shapes.threedimensionalshapes;

import javafx.scene.image.Image;

/**
 * File name: TallCircularLikeShape.java
 * Name: Jared Morris
 * Purpose: A skeleton class used for shapes that need a height and a radius
 * defined as properties to calculate its volume
 */
public abstract class TallCircularLikeShape extends ThreeDimensionalShape {
    protected double height;
    protected double radius;

    public TallCircularLikeShape(int numberOfSides, double height, double radius, Image shapImage) {
        super(numberOfSides, shapImage);
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }
}