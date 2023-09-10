package shapes.twodimensionalshapes.impl;

import javafx.scene.image.Image;
import shapes.twodimensionalshapes.SquareLikeShape;
import utils.ConstantValues;
import utils.TwoDimensionalShapeImageEnum;

/**
 * File name: Rectangle.java
 * Name: Jared Morris
 * Purpose: Define a Rectangle object and calculate its area
 */
public class Rectangle extends SquareLikeShape {

    public Rectangle(double width, double height) {
        super(ConstantValues.SQUARE_SIDES, width, height,
                new Image(TwoDimensionalShapeImageEnum.RECTANGLE.getImageFromUrl()));
    }

}