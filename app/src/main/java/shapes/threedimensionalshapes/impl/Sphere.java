package shapes.threedimensionalshapes.impl;

import shapes.threedimensionalshapes.ThreeDimensionalShape;
import utils.ConstantValues;
import utils.MathUtils;

/**
 * File name: Sphere.java
 * Name: Jared Morris
 * Purpose: Define a Sphere object and calculate its volume
 */
public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        super(ConstantValues.CIRCLE_SIDES);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * ConstantValues.PI * MathUtils.cubeNum(radius);
    }

}