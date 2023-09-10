package shapes.threedimensionalshapes.impl;

import javafx.scene.image.Image;
import shapes.threedimensionalshapes.TallCircularLikeShape;
import utils.ConstantValues;
import utils.MathUtils;
import utils.ThreeDimensionalShapeImageEnum;

/**
 * File name: Cylinder.java
 * Name: Jared Morris
 * Purpose: Define a Cylinder object and calculate its volume
 */
public class Cylinder extends TallCircularLikeShape {

    public Cylinder(double height, double radius) {
        super(ConstantValues.CYLINDER_SIDES, height, radius,
                new Image(ThreeDimensionalShapeImageEnum.CYLINDER.getImageFromUrl()));
    }

    @Override
    public double getVolume() {
        return ConstantValues.PI * MathUtils.squareNum(this.radius) * this.height;
    }

}