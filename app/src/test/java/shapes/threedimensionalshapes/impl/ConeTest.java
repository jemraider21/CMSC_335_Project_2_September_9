package shapes.threedimensionalshapes.impl;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.ConstantValues;

public class ConeTest {
    private final static Map<Double, Map<Integer, Integer>> TEST_MAP = Map.of(
            // Expected Value, Map.of(Height, Radius)
            4.1887902047863905, Map.of(1, 2),
            50.26548245743669, Map.of(3, 4),
            188.4955592153876, Map.of(5, 6));

    @Test
    void testConstructor() {
        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);
                Assertions.assertNotNull(new Cone(height, radius));
            }
        }
    }

    @Test
    void testGetNumberOfSides() {
        Cone testCone;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);

                testCone = new Cone(height, radius);
                Assertions.assertEquals(ConstantValues.CONE_SIDES, testCone.getNumberOfSides());
            }
        }
    }

    @Test
    void testGetHeight() {
        Cone testCone;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);

                testCone = new Cone(height, radius);
                Assertions.assertEquals(height, testCone.getHeight());
            }
        }
    }

    @Test
    void testGetRadius() {
        Cone testCone;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);

                testCone = new Cone(height, radius);
                Assertions.assertEquals(radius, testCone.getRadius());
            }
        }
    }

    @Test
    void testGetVolume() {
        Cone testCone;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> widthHeightMap = TEST_MAP.get(expectedValue);
            for (int height : widthHeightMap.keySet()) {
                int radius = widthHeightMap.get(height);

                testCone = new Cone(height, radius);
                Assertions.assertEquals(expectedValue, testCone.getVolume());
            }
        }
    }
}
