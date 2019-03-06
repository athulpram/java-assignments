package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {

    @Test
    void isCatPlayingShouldReturnTrue() {
        boolean actual = PlayingCat.isCatPlaying(true,36);
        assertTrue(actual);
    }

    @Test
    void isCatPlayingShouldReturnFalse() {
        boolean actual = PlayingCat.isCatPlaying(false,36);
        assertFalse(actual);
    }
}