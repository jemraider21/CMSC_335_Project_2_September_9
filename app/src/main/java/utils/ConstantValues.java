package utils;

import java.io.InputStream;

/**
 * File name: ConstantValues.java
 * Name: Jared Morris
 * Purpose: An "enumeration" of constant values used throughout the program
 */
public class ConstantValues {
    public final static int CIRCLE_SIDES = 1;
    public final static int CONE_SIDES = 2;
    public final static int CUBE_SIDES = 6;
    public final static int CYLINDER_SIDES = 2;
    public final static String DEFAULT_NUM_VALUE = "0.0";
    public final static String IMAGE_KEY = "Image";
    public final static double PI = Math.PI;
    public final static String SHAPE_KEY = "Shape";
    public final static int SQUARE_SIDES = 4;
    public final static int TORUS_SIDES = 1;
    public final static int TRIANGLE_SIDES = 3;

    public static InputStream getImageFromUrl(String shapeName) {

        return ConstantValues.class.getResourceAsStream(String.format("/%s.png", shapeName));
    }
}