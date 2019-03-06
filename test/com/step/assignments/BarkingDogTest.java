package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    @Test
    void shouldWakeUpReturnsTrue() {
        boolean actual = BarkingDog.shouldWakeUp(true, 1);
        assertEquals(true,actual);
    }

    @Test
    void shouldWakeUpReturnsFalse(){
        boolean actual = BarkingDog.shouldWakeUp(false, 1);
        assertEquals(false,actual);
    }
}