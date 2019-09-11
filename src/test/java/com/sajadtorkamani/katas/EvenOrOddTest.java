package com.sajadtorkamani.katas;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

// https://www.codewars.com/kata/even-or-odd/train/java
public class EvenOrOddTest {
    @Test
    public void even_or_odd_returnsCorrectResult() {
        assertEquals("Even", EvenOrOdd.even_or_odd(4));
        assertEquals("Even", EvenOrOdd.even_or_odd(20));

        assertEquals("Odd", EvenOrOdd.even_or_odd(3));
        assertEquals("Odd", EvenOrOdd.even_or_odd(17));
    }
}
