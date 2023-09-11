package shapes.threedimensionalshapes.impl;

import javafx.scene.image.Image;
import lombok.Getter;
import shapes.threedimensionalshapes.ThreeDimensionalShape;
import utils.ConstantValues;
import utils.MathUtils;
import utils.ThreeDimensionalShapeImageEnum;

/**
 * File name: Cube.java
 * Name: Jared Morris
 * Purpose: Define a Cube object and calculate its volume
 */
public class Cube extends ThreeDimensionalShape {
    @Getter
    private double length;

    public Cube(double length) {
        super(ConstantValues.CUBE_SIDES, new Image(ThreeDimensionalShapeImageEnum.CUBE.getImageFromUrl()));
        this.length = length;
    }

    @Override
    public double getVolume() {
        return MathUtils.cubeNum(length);
    }

}