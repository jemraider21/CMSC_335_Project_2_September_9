package shapes.threedimensionalshapes.impl;

import shapes.threedimensionalshapes.ThreeDimensionalShape;
import utils.ConstantValues;
import utils.MathUtils;

/**
 * File name: Torus.java
 * Name: Jared Morris
 * Purpose: Define a Torus object and calculate its volume
 */
public class Torus extends ThreeDimensionalShape {

    private double radiusMajor;
    private double radiusMinor;

    public Torus(double radiusMajor, double radiusMinor) {
        super(ConstantValues.TORUS_SIDES);
        this.radiusMajor = radiusMajor;
        this.radiusMinor = radiusMinor;
    }

    @Override
    public double getVolume() {
        return (ConstantValues.PI * MathUtils.squareNum(radiusMinor)) * (2 * ConstantValues.PI * radiusMajor);
    }

}