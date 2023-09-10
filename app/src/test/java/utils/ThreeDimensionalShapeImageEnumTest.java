package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeDimensionalShapeImageEnumTest {
    @Test
    void testImagePathIsCorrect() {
        for (ThreeDimensionalShapeImageEnum entry : ThreeDimensionalShapeImageEnum.values()) {
            Assertions.assertNotNull(entry.getImageFromUrl());
            Assertions.assertNotEquals(0, entry.getImageFromUrl());
        }
    }
}
