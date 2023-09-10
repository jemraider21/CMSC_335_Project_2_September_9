package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IShapesTest {
    @Test
    void testGetNumberOfSides() {
        int expectedNumberOfSides = 0;
        Assertions.assertEquals(expectedNumberOfSides, new ConcreteShape().getNumberOfSides());

        expectedNumberOfSides = 1;
        Assertions.assertEquals(expectedNumberOfSides, new ConcreteShape(expectedNumberOfSides).getNumberOfSides());
    }

    private class ConcreteShape extends IShape {
        public ConcreteShape() {
            this(0);
        }

        public ConcreteShape(int numberOfSides) {
            super(numberOfSides);
        }
    }
}
