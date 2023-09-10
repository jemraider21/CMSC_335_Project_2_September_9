package shapes.threedimensionalshapes.impl;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.ConstantValues;

public class TorusTest {
    private final static Map<Double, Map<Integer, Integer>> TEST_MAP = Map.of(
            // Expected Value, Map.of(Radius Major, Radius Minor)
            236.8705056261446, Map.of(3, 2),
            315.82734083485946, Map.of(4, 2),
            394.7841760435743, Map.of(5, 2));

    @Test
    void testConstructor() {
        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> radiusMajorMinorMap = TEST_MAP.get(expectedValue);
            for (int radiusMajor : radiusMajorMinorMap.keySet()) {
                int radiusMinor = radiusMajorMinorMap.get(radiusMajor);
                Assertions.assertNotNull(new Torus(radiusMajor, radiusMinor));
            }
        }
    }

    @Test
    void testGetNumberOfSides() {
        Torus testTorus;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> radiusMajorMinorMap = TEST_MAP.get(expectedValue);
            for (int radiusMajor : radiusMajorMinorMap.keySet()) {
                int radiusMinor = radiusMajorMinorMap.get(radiusMajor);

                testTorus = new Torus(radiusMajor, radiusMinor);
                Assertions.assertEquals(ConstantValues.TORUS_SIDES, testTorus.getNumberOfSides());
            }
        }
    }

    @Test
    void testGetRadiusMajor() {
        Torus testTorus;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> radiusMajorMinorMap = TEST_MAP.get(expectedValue);
            for (int radiusMajor : radiusMajorMinorMap.keySet()) {
                int radiusMinor = radiusMajorMinorMap.get(radiusMajor);

                testTorus = new Torus(radiusMajor, radiusMinor);
                Assertions.assertEquals(radiusMajor, testTorus.getRadiusMajor());
            }
        }
    }

    @Test
    void testGetRadiusMinor() {
        Torus testTorus;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> radiusMajorMinorMap = TEST_MAP.get(expectedValue);
            for (int radiusMajor : radiusMajorMinorMap.keySet()) {
                int radiusMinor = radiusMajorMinorMap.get(radiusMajor);

                testTorus = new Torus(radiusMajor, radiusMinor);
                Assertions.assertEquals(radiusMinor, testTorus.getRadiusMinor());
            }
        }
    }

    @Test
    void testGetVolume() {
        Torus testTorus;

        for (double expectedValue : TEST_MAP.keySet()) {
            Map<Integer, Integer> radiusMajorMinorMap = TEST_MAP.get(expectedValue);
            for (int radiusMajor : radiusMajorMinorMap.keySet()) {
                int radiusMinor = radiusMajorMinorMap.get(radiusMajor);

                testTorus = new Torus(radiusMajor, radiusMinor);
                Assertions.assertEquals(expectedValue, testTorus.getVolume());
            }
        }
    }
}
