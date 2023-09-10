package shapes.twodimensionalshapes.impl;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.ConstantValues;

public class SquareTest {
    private final static Map<Integer, Integer> TEST_MAP = Map.of(
            // Width, Expected Value
            20, 400,
            40, 1600,
            60, 3600);

    @Test
    void testConstructor() {
        for (int width : TEST_MAP.keySet()) {
            Assertions.assertNotNull(new Square(width));
        }
    }

    @Test
    void testGetNumberOfSides() {
        Square testSquare;

        for (int width : TEST_MAP.keySet()) {
            testSquare = new Square(width);
            Assertions.assertEquals(ConstantValues.SQUARE_SIDES, testSquare.getNumberOfSides());
        }
    }

    @Test
    void testGetWidth() {
        Square testSquare;

        for (int width : TEST_MAP.keySet()) {
            testSquare = new Square(width);
            Assertions.assertEquals(width, testSquare.getWidth());
            Assertions.assertEquals(testSquare.getWidth(), testSquare.getHeight());
        }
    }

    @Test
    void testGetArea() {
        Square testSquare;

        for (int width : TEST_MAP.keySet()) {
            testSquare = new Square(width);

            int expectedValue = TEST_MAP.get(width);
            Assertions.assertEquals(expectedValue, testSquare.getArea());
        }
    }
}
