package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @Test
    void areaShouldReturnAreaOfCircle() {
        double actual = AreaCalculator.area(5);
        double expected = 78.53981633974483;
        assertEquals(expected,actual);
    }

    @Test
    void areaShouldReturnAreaOfARectangle() {
        double actual = AreaCalculator.area(5,5);
        assertEquals(25,actual);
    }
}