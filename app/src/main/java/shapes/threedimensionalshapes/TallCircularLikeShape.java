package shapes.threedimensionalshapes;

import javafx.scene.image.Image;
import lombok.Getter;

/**
 * File name: TallCircularLikeShape.java
 * Name: Jared Morris
 * Purpose: A skeleton class used for shapes that need a height and a radius
 * defined as properties to calculate its volume
 */

@Getter
public abstract class TallCircularLikeShape extends ThreeDimensionalShape {
    protected double height;
    protected double radius;

    protected TallCircularLikeShape(int numberOfSides, double height, double radius, Image shapImage) {
        super(numberOfSides, shapImage);
        this.height = height;
        this.radius = radius;
    }
}