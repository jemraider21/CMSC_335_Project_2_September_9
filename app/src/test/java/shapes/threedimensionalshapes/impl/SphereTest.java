package shapes.threedimensionalshapes.impl;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.ConstantValues;

public class SphereTest {
    private final static Map<Double, Double> TEST_MAP = Map.of(
            // Radius, Expected Value
            3.14, 129.68135913577137,
            4.0, 268.082573106329,
            2.0, 33.510321638291124);

    @Test
    void testConstructor() {
        for (double radius : TEST_MAP.keySet()) {
            Assertions.assertNotNull(new Sphere(radius));
            ;
        }
    }

    @Test
    void testGetNumberOfSides() {
        Sphere testSphere;

        for (double radius : TEST_MAP.keySet()) {
            testSphere = new Sphere(radius);
            Assertions.assertEquals(ConstantValues.CIRCLE_SIDES, testSphere.getNumberOfSides());
        }
    }

    @Test
    void testGetRadius() {
        Sphere testSphere;

        for (double radius : TEST_MAP.keySet()) {
            testSphere = new Sphere(radius);
            Assertions.assertEquals(radius, testSphere.getRadius());
        }
    }

    @Test
    void testGetVolume() {
        Sphere testSphere;

        for (double radius : TEST_MAP.keySet()) {
            testSphere = new Sphere(radius);

            double expectedValue = TEST_MAP.get(radius);
            Assertions.assertEquals(expectedValue, testSphere.getVolume());
        }
    }
}
