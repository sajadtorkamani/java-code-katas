package com.sajadtorkamani.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/square-every-digit/train/java
class SquareDigitTest {
    @Test
    void squareDigits_squares_every_digit() {
        assertEquals(new SquareDigit().squareDigits(9119), 811181);
        assertEquals(new SquareDigit().squareDigits(43), 169);
    }
}
