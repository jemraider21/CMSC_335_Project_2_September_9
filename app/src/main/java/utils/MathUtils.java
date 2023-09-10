package utils;

/**
 * File name: MathUtils.java
 * Name: Jared Morris
 * Purpose: a utility class designed to reuse common mathematical equations
 * throughout the program
 */
public class MathUtils {
    public static double squareNum(double number) {
        return raiseNumberToPower(number, 2);
    }

    public static double cubeNum(double number) {
        return raiseNumberToPower(number, 3);
    }

    private static double raiseNumberToPower(double number, double power) {
        return Math.pow(number, power);
    }
}