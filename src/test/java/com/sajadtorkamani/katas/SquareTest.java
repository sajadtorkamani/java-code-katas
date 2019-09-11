package com.sajadtorkamani.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://www.codewars.com/kata/youre-a-square/train/java
class SquareTest {
    @Test
    void isSquare_returns_true_if_num_is_a_square() {
        assertTrue(Square.isSquare(4));
        assertTrue(Square.isSquare(25));
        assertTrue(Square.isSquare(0));

        assertFalse(Square.isSquare(-1));
        assertFalse(Square.isSquare(3));
        assertFalse(Square.isSquare(26));
    }
}
