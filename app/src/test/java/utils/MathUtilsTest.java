package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    void testSquareNum() {
        Assertions.assertEquals(1, MathUtils.squareNum(1));
        Assertions.assertEquals(4, MathUtils.squareNum(2));
        Assertions.assertEquals(10.889999999999999, MathUtils.squareNum(3.3));
        Assertions.assertEquals(100, MathUtils.squareNum(10));
    }

    @Test
    void testCubeNum() {
        Assertions.assertEquals(1.0, MathUtils.cubeNum(1));
        Assertions.assertEquals(8.0, MathUtils.cubeNum(2));
        Assertions.assertEquals(35.937, MathUtils.cubeNum(3.3));
    }
}
