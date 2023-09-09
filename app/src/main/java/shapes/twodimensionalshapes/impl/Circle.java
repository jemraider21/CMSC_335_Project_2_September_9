package shapes.twodimensionalshapes.impl;

import shapes.twodimensionalshapes.TwoDimensionalShape;
import utils.ConstantValues;
import utils.MathUtils;

/**
 * File name: Circle.java
 * Name: Jared Morris
 * Purpose: Define a Circle object and calculate its area
 */
public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        super(ConstantValues.CIRCLE_SIDES);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return ConstantValues.PI * MathUtils.squareNum(radius);
    }
}