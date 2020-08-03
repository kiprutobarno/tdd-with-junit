package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametizedTest {
    @Parameter(0)
    public int a;

    @Parameter(1)
    public int b;

    @Parameter(2)
    public int result;

    @Parameters
    public static List<Object> sums() {
        Object[][] data = new Object[][] { { 3, 2, 5 }, { 4, 3, 7 } };
        return Arrays.asList(data);
    }

    public static List<Object> multiples() {
        Object[][] data = new Object[][] { { 3, 2, 6 }, { 4, 3, 12 } };
        return Arrays.asList(data);
    }

    Sum testSum = new Sum();
    Multiply testMultiple = new Multiply();

    @Test
    public void testSumException() {
        assertEquals(result, testSum.sum(a, b));
    }

    @Test
    public void testMultiplyException() {
        assertEquals(result, testMultiple.multiply(a, b));
    }

}