package shapes.twodimensionalshapes.impl;

import shapes.twodimensionalshapes.SquareLikeShape;
import utils.ConstantValues;

/**
 * File name: Rectangle.java
 * Name: Jared Morris
 * Purpose: Define a Rectangle object and calculate its area
 */
public class Rectangle extends SquareLikeShape {

    public Rectangle(double width, double height) {
        super(ConstantValues.SQUARE_SIDES, width, height, new javafx.scene.shape.Rectangle(50, 50, width, height));
    }

}