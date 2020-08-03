package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MathTest {
    Math math = new Math();

    @Test
    public void SumTwoNumbers() {
        assertEquals(5, math.sum(3, 2));
    }
}