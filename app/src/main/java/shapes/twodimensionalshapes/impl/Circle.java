package shapes.twodimensionalshapes.impl;

import javafx.scene.image.Image;
import lombok.Getter;
import shapes.twodimensionalshapes.TwoDimensionalShape;
import utils.ConstantValues;
import utils.MathUtils;
import utils.TwoDimensionalShapeImageEnum;

/**
 * File name: Circle.java
 * Name: Jared Morris
 * Purpose: Define a Circle object and calculate its area
 */
public class Circle extends TwoDimensionalShape {
    @Getter
    private double radius;

    public Circle(double radius) {
        super(ConstantValues.CIRCLE_SIDES, new Image(TwoDimensionalShapeImageEnum.CIRCLE.getImageFromUrl()));
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return ConstantValues.PI * MathUtils.squareNum(radius);
    }
}