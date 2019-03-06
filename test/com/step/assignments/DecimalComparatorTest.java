package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

    @Test
    void areEqualByThreeDecimalPlacesShouldReturnTrue() {
        boolean actual = DecimalComparator.areEqualByThreeDecimalPlaces(9.8956, 9.895);
        assertTrue(actual);
    }

    @Test
    void areEqualByThreeDecimalPlacesShouldReturnFalse() {
        boolean actual = DecimalComparator.areEqualByThreeDecimalPlaces(9.8956, 9.995);
        assertFalse(actual);
    }
}