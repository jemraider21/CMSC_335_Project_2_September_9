package shapes.threedimensionalshapes.impl;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.ConstantValues;

public class CylinderTest {
    private final static Map<Double, Map<Integer, Integer>> TEST_MAP = Map.of(
            // Expected Value, Map.of(Height, Radius)
            100.53096491487338, Map.of(2, 4),
            339.29200658769764, Map.of(3, 6),
            804.247719318987, Map.of(4, 8));

    @Test
    void testConstructor() {
        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);
                Assertions.assertNotNull(new Cylinder(height, radius));
            }
        }
    }

    @Test
    void testGetNumberOfSides() {
        Cylinder testCylinder;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);

                testCylinder = new Cylinder(height, radius);
                Assertions.assertEquals(ConstantValues.CYLINDER_SIDES, testCylinder.getNumberOfSides());
            }
        }
    }

    @Test
    void testGetHeight() {
        Cylinder testCylinder;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);

                testCylinder = new Cylinder(height, radius);
                Assertions.assertEquals(height, testCylinder.getHeight());
            }
        }
    }

    @Test
    void testGetRadius() {
        Cylinder testCylinder;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);

                testCylinder = new Cylinder(height, radius);
                Assertions.assertEquals(radius, testCylinder.getRadius());
            }
        }
    }

    @Test
    void testGetVolume() {
        Cylinder testCylinder;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);

                testCylinder = new Cylinder(height, radius);
                Assertions.assertEquals(expectedValue, testCylinder.getVolume());
            }
        }
    }
}
