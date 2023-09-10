package shapes;

import javafx.scene.image.Image;

public abstract class IShape {
    private int numberOfSides;
    private Image shapeImage;

    public IShape(int numberOfSides, Image shapeImage) {
        this.numberOfSides = numberOfSides;
        this.shapeImage = shapeImage;
    }

    public Image getShapeImage() {
        return shapeImage;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}