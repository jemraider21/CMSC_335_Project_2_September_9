package shapes.threedimensionalshapes.impl;

import javafx.scene.image.Image;
import lombok.Getter;
import shapes.threedimensionalshapes.ThreeDimensionalShape;
import utils.ConstantValues;
import utils.MathUtils;
import utils.ThreeDimensionalShapeImageEnum;

/**
 * File name: Torus.java
 * Name: Jared Morris
 * Purpose: Define a Torus object and calculate its volume
 */
@Getter
public class Torus extends ThreeDimensionalShape {

    private double radiusMajor;
    private double radiusMinor;

    public Torus(double radiusMajor, double radiusMinor) {
        super(ConstantValues.TORUS_SIDES, new Image(ThreeDimensionalShapeImageEnum.TORUS.getImageFromUrl()));
        this.radiusMajor = radiusMajor;
        this.radiusMinor = radiusMinor;
    }

    @Override
    public double getVolume() {
        return (ConstantValues.PI * MathUtils.squareNum(radiusMinor)) * (2 * ConstantValues.PI * radiusMajor);
    }

}