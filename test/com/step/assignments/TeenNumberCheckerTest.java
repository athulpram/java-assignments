package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @Test
    void hasTeenShouldReturnTrue() {
        boolean actual = TeenNumberChecker.hasTeen(8,20, 17);
        assertTrue(actual);
    }

    @Test
    void isTeenShouldReturnTrue() {
        boolean actual = TeenNumberChecker.isTeen(15);
        assertTrue(actual);
    }
}