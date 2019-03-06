package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

    @Test
    void hasEqualSumReturnsTrue() {
        boolean actual = EqualSumChecker.hasEqualSum(1, 6, 7);
        assertTrue(actual);
    }
}