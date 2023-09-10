package shapes.threedimensionalshapes.impl;

import javafx.scene.image.Image;
import shapes.threedimensionalshapes.TallCircularLikeShape;
import utils.ConstantValues;
import utils.MathUtils;
import utils.ThreeDimensionalShapeImageEnum;

/**
 * File name: Cone.java
 * Name: Jared Morris
 * Purpose: Define a Cone object and calculate its volume
 */
public class Cone extends TallCircularLikeShape {

    public Cone(double height, double radius) {
        super(ConstantValues.CONE_SIDES, height, radius,
                new Image(ThreeDimensionalShapeImageEnum.CONE.getImageFromUrl()));
    }

    @Override
    public double getVolume() {
        return ConstantValues.PI * MathUtils.squareNum(this.radius) * (this.height / 3);
    }

}