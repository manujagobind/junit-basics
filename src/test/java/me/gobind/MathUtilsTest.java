package me.gobind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    
    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();

        int expected = 2;
        int actual = mathUtils.add(1, 1);

        assertEquals(expected, actual, "This method should add two numbers.");
    }

    @Test
    void testComputeCircleArea() {
        MathUtils mathUtils = new MathUtils();

        double expected = 314.1592653589793;
        double actual = mathUtils.computeCircleArea(10);

        assertEquals(expected, actual, "Should return circle area.");
    }
}
