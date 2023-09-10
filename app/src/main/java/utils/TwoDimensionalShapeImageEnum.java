package utils;

import java.io.InputStream;

public enum TwoDimensionalShapeImageEnum implements ShapeImage {
    CIRCLE("circle"),
    RECTANGLE("rectangle"),
    SQUARE("square"),
    TRIANGLE("triangle");

    String shapeName;

    private TwoDimensionalShapeImageEnum(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public InputStream getImageFromUrl() {
        return ConstantValues.getImageFromUrl(shapeName);
    }
}