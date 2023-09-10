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

    // public String getImageUrl() {
    // return String.format("src/main/java/threedimensionalshapes/imgs/%s.png",
    // shapeName);
    // }

    public InputStream getImageFromUrl() {
        return ConstantValues.getImageFromUrl(shapeName);
    }
}
