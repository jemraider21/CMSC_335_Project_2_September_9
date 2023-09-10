package shapes.twodimensionalshapes.impl;

import javafx.scene.image.Image;
import shapes.twodimensionalshapes.SquareLikeShape;
import utils.ConstantValues;
import utils.TwoDimensionalShapeImageEnum;

/**
 * File name: Square.java
 * Name: Jared Morris
 * Purpose: Define a Square object and calculate its area
 */
public class Square extends SquareLikeShape {

    public Square(double width) {
        super(ConstantValues.SQUARE_SIDES, width, width,
                new Image(TwoDimensionalShapeImageEnum.SQUARE.getImageFromUrl()));
    }
}