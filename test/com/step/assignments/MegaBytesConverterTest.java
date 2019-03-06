package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MegaBytesConverterTest {

    @Test
    void printMegaBytesAndKiloBytes() {
        String actual = MegaBytesConverter.printMegaBytesAndKiloBytes(250);
        assertEquals("250 KB = 0 MB and 250 KB", actual);
    }
}