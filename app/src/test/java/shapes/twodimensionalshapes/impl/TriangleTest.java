package shapes.twodimensionalshapes.impl;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.ConstantValues;

public class TriangleTest {
    private final static Map<Integer, Map<Integer, Integer>> TEST_MAP = Map.of(
            // Expected Value, Map.of(Width, Heigth)
            150, Map.of(15, 20),
            200, Map.of(40, 10),
            189, Map.of(18, 21));

    @Test
    void testConstructor() {
        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                Assertions.assertNotNull(new Triangle(width, height));
            }
        }
    }

    @Test
    void testGetNumberOfSides() {
        Triangle testTriangle;

        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                testTriangle = new Triangle(width, height);

                Assertions.assertEquals(ConstantValues.TRIANGLE_SIDES, testTriangle.getNumberOfSides());
            }
        }
    }

    @Test
    void testGetWidth() {
        Triangle testTriangle;

        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                testTriangle = new Triangle(width, height);

                Assertions.assertEquals(width, testTriangle.getWidth());
            }
        }
    }

    @Test
    void testGetHeight() {
        Triangle testTriangle;

        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                testTriangle = new Triangle(width, height);

                Assertions.assertEquals(height, testTriangle.getHeight());
            }
        }
    }

    @Test
    void testGetArea() {
        Triangle testTriangle;

        for (int expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int width : widthHeightMap.keySet()) {
                int height = widthHeightMap.get(width);
                testTriangle = new Triangle(width, height);

                Assertions.assertEquals(expectedValue, testTriangle.getArea());
            }
        }
    }
}
