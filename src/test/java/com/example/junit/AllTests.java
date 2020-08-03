package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({ Multiply.class, Sum.class })
public class AllTests {
    Sum sum = new Sum();
    Multiply multiply = new Multiply();
    Divide divide = new Divide();

    @Test
    public void addNumbers() {
        assertEquals(7, sum.sum(4, 3));
    }

    @Test
    public void multiplyNumbers() {
        assertEquals(12, multiply.multiply(4, 3));
    }

    @Test
    public void divideNumber() {
        assertEquals(4 / 3, divide.divide(4, 3));
    }
}