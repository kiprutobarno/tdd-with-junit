package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MathTest {
    Math math = new Math();

    @BeforeAll
    public void before(){
        System.out.println("Before");
    }

    @AfterAll
    public void after(){
        System.out.println("After");
    }

    @Test
    public void SumTwoNumbers() {
        assertEquals(5, math.sum(3, 2));
    }
}