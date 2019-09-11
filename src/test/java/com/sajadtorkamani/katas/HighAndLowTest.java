package com.sajadtorkamani.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighAndLowTest {
    @Test
    void highAndLow_returns_highest_and_lowest_nums() {
        assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
