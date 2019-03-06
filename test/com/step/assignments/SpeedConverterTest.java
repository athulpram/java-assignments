package com.step.assignments;

import org.junit.jupiter.api.Test;

import static com.step.assignments.SpeedConverter.printConversion;
import static com.step.assignments.SpeedConverter.toMilesPerHour;
import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {

    @Test
    void toMilesPerHourShouldReturnMilesForFollowing() {
        long actual = toMilesPerHour(1);
        long expected = 1;
        assertEquals(expected,actual);

        actual = toMilesPerHour(1.5);
        expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void printConversionShouldReturnPrintableString() {
        String actual = printConversion(1.5);
        String expected = "1.5 km/h = 1 mi/h";
        assertEquals(expected,actual);
    }
}