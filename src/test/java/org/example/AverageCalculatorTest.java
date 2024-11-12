package org.example;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageCalculatorTest {

    AverageCalculator calculator = new AverageCalculator();

    // Test Case cho Đường cơ bản 1 (Path 1)
    @Test
    public void testPath1() {
        int[] values = {1, 2, 3, -999};
        int minimum = 10;
        int maximum = 20;
        int expected = -999;
        int result = calculator.average(values, minimum, maximum);
        assertEquals(expected, result, "Path 1 failed");
    }

    // Test Case cho Đường cơ bản 2 (Path 3)
    @Test
    public void testPath3() {
        int[] values = {15, 25, -999};
        int minimum = 10;
        int maximum = 20;
        int expected = 15;
        int result = calculator.average(values, minimum, maximum);
        assertEquals(expected, result, "Path 3 failed");
    }

    // Test Case cho Đường cơ bản 3 (Path 5)
    @Test
    public void testPath5() {
        int[] values = {15, 18, 5, -999};
        int minimum = 10;
        int maximum = 20;
        int expected = 16; // Trung bình của 15 và 18 là 16
        int result = calculator.average(values, minimum, maximum);
        assertEquals(expected, result, "Path 5 failed");
    }

    // Test Case cho Đường cơ bản 4 (Path 6)
    @Test
    public void testPath6() {
        int[] values = {16, 18, 25, -999};
        int minimum = 10;
        int maximum = 30;
        int expected = 19; // Trung bình của 16 và 18 và 25 là 19
        int result = calculator.average(values, minimum, maximum);
        assertEquals(expected, result, "Path 6 failed");
    }
}