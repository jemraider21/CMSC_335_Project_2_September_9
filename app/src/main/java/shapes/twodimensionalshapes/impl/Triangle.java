package shapes.twodimensionalshapes.impl;

import shapes.twodimensionalshapes.SquareLikeShape;
import utils.ConstantValues;

/**
 * File name: Triangle.java
 * Name: Jared Morris
 * Purpose: Define a Triangle object and calculate its area
 */
public class Triangle extends SquareLikeShape {

    public Triangle(double base, double height) {
        super(ConstantValues.TRIANGLE_SIDES, base, height);
    }

    public double getArea() {
        return super.getArea() / 2;
    }
}