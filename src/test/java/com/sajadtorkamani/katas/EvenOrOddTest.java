package com.sajadtorkamani.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/even-or-odd/train/java
class EvenOrOddTest {
    @Test
    void even_or_odd_returnsCorrectResult() {
        assertEquals("Even", EvenOrOdd.even_or_odd(4));
        assertEquals("Even", EvenOrOdd.even_or_odd(20));

        assertEquals("Odd", EvenOrOdd.even_or_odd(3));
        assertEquals("Odd", EvenOrOdd.even_or_odd(17));
    }
}
