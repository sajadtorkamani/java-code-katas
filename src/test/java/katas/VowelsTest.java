package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/vowel-count/train/java
class VowelsTest {
    @Test
    void getCount_returnsCorrectVowelsCount() {
        assertEquals(5, Vowels.getCount("abracadabra"));
        assertEquals(2, Vowels.getCount("planet"));

        assertEquals(0, Vowels.getCount("bdgh"));
    }
}