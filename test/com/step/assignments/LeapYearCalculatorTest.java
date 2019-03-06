package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {

    @Test
    void isLeapYear() {
        boolean actual = LeapYearCalculator.isLeapYear(2000);
        assertEquals(true,actual);
    }
}