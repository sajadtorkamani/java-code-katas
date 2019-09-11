package com.sajadtorkamani.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

// https://www.codewars.com/kata/exes-and-ohs/train/java
class ExesAndOhsTest {
    @Test
    void getXO_returns_true_if_same_number_of_x_and_o() {
        assertTrue(ExesAndOhs.getXO("xxxooo"));
        assertTrue(ExesAndOhs.getXO("xxxXooOo"));
        assertTrue(ExesAndOhs.getXO("zssddd"));

        assertFalse(ExesAndOhs.getXO("XxxxooO"));
        assertFalse(ExesAndOhs.getXO("Xxxxertr34"));
        assertFalse(ExesAndOhs.getXO("xxx23424esdsfvxXExesAndOhsOooo"));
        assertFalse(ExesAndOhs.getXO("xXxxoewrcoOoo"));
    }
}
