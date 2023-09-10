package shapes.twodimensionalshapes.impl;

import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.ConstantValues;

public class CircleTest {
    private static final Map<Integer, Double> TEST_MAP = Map.of(
            // Radius, Expected Value
            1, 3.141592653589793,
            5, 78.53981633974483,
            25, 1963.4954084936207);

    @Test
    void testConstructor() {
        for (int radius : TEST_MAP.keySet()) {
            Assertions.assertNotNull(new Circle(radius));
        }
    }

    @Test
    void testGetNumberOfSides() {
        for (int radius : TEST_MAP.keySet()) {
            Assertions.assertEquals(ConstantValues.CIRCLE_SIDES, new Circle(radius).getNumberOfSides());
        }
    }

    @Test
    void testGetRadius() {
        Circle testCircle;
        for (int radius : TEST_MAP.keySet()) {
            testCircle = new Circle(radius);
            Assertions.assertEquals(radius, testCircle.getRadius());
        }
    }

    @Test
    void testGetArea() {
        Circle testCircle;

        for (int radius : TEST_MAP.keySet()) {
            double expectedArea = TEST_MAP.get(radius);

            testCircle = new Circle(radius);
            Assertions.assertEquals(expectedArea, testCircle.getArea());
        }
    }
}
