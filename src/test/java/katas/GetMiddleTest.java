package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/get-the-middle-character/train/java
class GetMiddleTest {
    @Test
    void getMiddle_handles_even_length_words() {
        assertEquals("j", GetMiddle.getMiddle("sajad"));
        assertEquals("b", GetMiddle.getMiddle("macbook"));
    }

    @Test
    void getMiddle_handles_odd_length_words() {
        assertEquals("dd", GetMiddle.getMiddle("middle"));
        assertEquals("es", GetMiddle.getMiddle("test"));
    }
}
