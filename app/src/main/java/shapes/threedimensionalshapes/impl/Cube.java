package shapes.threedimensionalshapes.impl;

import shapes.threedimensionalshapes.ThreeDimensionalShape;
import utils.ConstantValues;
import utils.MathUtils;

/**
 * File name: Cube.java
 * Name: Jared Morris
 * Purpose: Define a Cube object and calculate its volume
 */
public class Cube extends ThreeDimensionalShape {
    private double length;

    public Cube(double length) {
        super(ConstantValues.CUBE_SIDES);
        this.length = length;
    }

    @Override
    public double getVolume() {
        return MathUtils.cubeNum(length);
    }

}