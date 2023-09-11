package utils;

import java.io.InputStream;

public enum ThreeDimensionalShapeImageEnum implements ShapeImage {
    CONE("cone"),
    CUBE("cube"),
    CYLINDER("cylinder"),
    SPHERE("sphere"),
    TORUS("torus");

    String shapeName;

    private ThreeDimensionalShapeImageEnum(String shapeName) {
        this.shapeName = shapeName;
    }

    public InputStream getImageFromUrl() {
        return ConstantValues.getImageFromUrl(shapeName);
    }
}
