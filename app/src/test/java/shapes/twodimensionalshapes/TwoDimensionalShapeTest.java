package shapes.twodimensionalshapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoDimensionalShapeTest {
    @Test
    public void testGetArea() {
        Assertions.assertEquals(0.5, new ConcreteTwoDimensionalShape(1).getArea());
        Assertions.assertEquals(1.0, new ConcreteTwoDimensionalShape(2).getArea());
        Assertions.assertEquals(1.5, new ConcreteTwoDimensionalShape(3).getArea());
    }

    private class ConcreteTwoDimensionalShape extends TwoDimensionalShape {
        public ConcreteTwoDimensionalShape(int numberOfSides) {
            super(numberOfSides);
        }

        public double getArea() {
            return (double) getNumberOfSides() / 2;
        }
    }
}
