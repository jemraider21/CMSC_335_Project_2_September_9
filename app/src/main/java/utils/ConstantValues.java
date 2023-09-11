package utils;

import java.io.InputStream;

/**
 * File name: ConstantValues.java
 * Name: Jared Morris
 * Purpose: An "enumeration" of constant values used throughout the program
 */
public class ConstantValues {
    public static final int CIRCLE_SIDES = 1;
    public static final int CONE_SIDES = 2;
    public static final int CUBE_SIDES = 6;
    public static final int CYLINDER_SIDES = 2;
    public static final String DEFAULT_NUM_VALUE = "0.0";
    public static final String IMAGE_KEY = "Image";
    public static final double PI = Math.PI;
    public static final String SHAPE_KEY = "Shape";
    public static final int SQUARE_SIDES = 4;
    public static final int TORUS_SIDES = 1;
    public static final int TRIANGLE_SIDES = 3;

    private ConstantValues(){}

    public static InputStream getImageFromUrl(String shapeName) {

        return ConstantValues.class.getResourceAsStream(String.format("/%s.png", shapeName));
    }
}