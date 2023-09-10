package shapes.twodimensionalshapes.impl;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.ConstantValues;

public class RectangleTest {
    private final static Map<Integer, Map<Integer, Integer>> TEST_MAP = Map.of(
            // Expected Value, Map.of(Width, Heigth)
            12, Map.of(3, 4),
            8, Map.of(2, 4),
            20, Map.of(5, 4));

    @Test
    void testConstructor() {
        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                Assertions.assertNotNull(new Rectangle(width, height));
            }
        }
    }

    @Test
    void testGetNumberOfSides() {
        Rectangle testRectangle;

        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                testRectangle = new Rectangle(width, height);

                Assertions.assertEquals(ConstantValues.SQUARE_SIDES, testRectangle.getNumberOfSides());
            }
        }
    }

    @Test
    void testGetWidth() {
        Rectangle testRectangle;

        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                testRectangle = new Rectangle(width, height);

                Assertions.assertEquals(width, testRectangle.getWidth());
            }
        }
    }

    @Test
    void testGetHeight() {
        Rectangle testRectangle;

        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                testRectangle = new Rectangle(width, height);

                Assertions.assertEquals(height, testRectangle.getHeight());
            }
        }
    }

    @Test
    void testGetArea() {
        Rectangle testRectangle;

        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                testRectangle = new Rectangle(width, height);

                Assertions.assertEquals(expectedValue, testRectangle.getArea());
            }
        }
    }
}
