package shapes.twodimensionalshapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareLikeShapeTest {
    @Test
    void testSquareLikeShapeConstruction() {
        Assertions.assertNotNull(new ConcreteSquareLikeShape(1, 1, 1));
        Assertions.assertNotNull(new ConcreteSquareLikeShape(2, 2.0, 2));
        Assertions.assertNotNull(new ConcreteSquareLikeShape(3, 3, 3.0));
    }

    @Test
    void testGetWidth() {
        SquareLikeShape testShape;

        testShape = new ConcreteSquareLikeShape(1, 2, 3);
        Assertions.assertEquals(2.0, testShape.getWidth());

        testShape = new ConcreteSquareLikeShape(4, 5.0, 6);
        Assertions.assertEquals(5.0, testShape.getWidth());

        testShape = new ConcreteSquareLikeShape(7, 8, 9.0);
        Assertions.assertEquals(8.0, testShape.getWidth());
    }

    @Test
    void testGetHeight() {
        SquareLikeShape testShape;

        testShape = new ConcreteSquareLikeShape(1, 2, 3);
        Assertions.assertEquals(3.0, testShape.getHeight());

        testShape = new ConcreteSquareLikeShape(4, 5.0, 6);
        Assertions.assertEquals(6.0, testShape.getHeight());

        testShape = new ConcreteSquareLikeShape(7, 8, 9.0);
        Assertions.assertEquals(9.0, testShape.getHeight());
    }

    @Test
    void testGetArea() {
        SquareLikeShape testShape;

        testShape = new ConcreteSquareLikeShape(1, 2, 3);
        Assertions.assertEquals(6.0, testShape.getArea());

        testShape = new ConcreteSquareLikeShape(4, 5.0, 6);
        Assertions.assertEquals(30.0, testShape.getArea());

        testShape = new ConcreteSquareLikeShape(7, 8, 9.0);
        Assertions.assertEquals(72.0, testShape.getArea());
    }

    private class ConcreteSquareLikeShape extends SquareLikeShape {
        public ConcreteSquareLikeShape(int numberOfSides, double width, double height) {
            super(numberOfSides, width, height);
        }
    }
}
