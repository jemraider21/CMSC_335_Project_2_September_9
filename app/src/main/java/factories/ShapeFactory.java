package factories;

import java.util.regex.Pattern;

import shapes.IShape;
import shapes.threedimensionalshapes.impl.Cone;
import shapes.threedimensionalshapes.impl.Cube;
import shapes.threedimensionalshapes.impl.Cylinder;
import shapes.threedimensionalshapes.impl.Sphere;
import shapes.threedimensionalshapes.impl.Torus;
import shapes.twodimensionalshapes.impl.Circle;
import shapes.twodimensionalshapes.impl.Rectangle;
import shapes.twodimensionalshapes.impl.Square;
import shapes.twodimensionalshapes.impl.Triangle;

public enum ShapeFactory {
    CIRCLE,
    CONE,
    CUBE,
    CYLINDER,
    RECTANGLE,
    SPHERE,
    SQUARE,
    TRIANGLE,
    TORUS;

    public static IShape createShape(ShapeFactory shapeType, String value1, String value2) {
        double num1 = Double.parseDouble(value1);
        double num2 = isNumeric(value2) ? Double.parseDouble(value2) : 0.0;

        IShape shape = null;
        switch (shapeType) {
            case CIRCLE:
                shape = new Circle(num1);
                break;
            case CONE:
                shape = new Cone(num1, num2);
                break;
            case CUBE:
                shape = new Cube(num1);
                break;
            case CYLINDER:
                shape = new Cylinder(num1, num2);
                break;
            case RECTANGLE:
                shape = new Rectangle(num1, num2);
                break;
            case SPHERE:
                shape = new Sphere(num1);
                break;
            case SQUARE:
                shape = new Square(num1);
                break;
            case TRIANGLE:
                shape = new Triangle(num1, num2);
                break;
            case TORUS:
                shape = new Torus(num1, num2);
        }
        return shape;
    }

    private static boolean isNumeric(String number) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        if (number == null) {
            return false;
        }
        return pattern.matcher(number).matches();
    }
}
