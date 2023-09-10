package shapes.threedimensionalshapes.impl;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.ConstantValues;

public class CubeTest {
    private final static Map<Integer, Integer> TEST_MAP = Map.of(
            // Length, Expected Value
            8, 512,
            27, 19683,
            64, 262144);

    @Test
    void testConstructor() {
        for (int length : TEST_MAP.keySet()) {
            Assertions.assertNotNull(new Cube(length));
        }
    }

    @Test
    void testGetNumberOfSides() {
        Cube testCube;

        for (int length : TEST_MAP.keySet()) {
            testCube = new Cube(length);
            Assertions.assertEquals(ConstantValues.CUBE_SIDES, testCube.getNumberOfSides());
        }
    }

    @Test
    void testGetHeight() {
        Cube testCube;

        for (int length : TEST_MAP.keySet()) {
            testCube = new Cube(length);
            Assertions.assertEquals(length, testCube.getLength());
        }
    }

    @Test
    void testGetVolume() {
        Cube testCube;

        for (int length : TEST_MAP.keySet()) {
            testCube = new Cube(length);

            int expectedValue = TEST_MAP.get(length);
            Assertions.assertEquals(expectedValue, testCube.getVolume());
        }
    }
}
