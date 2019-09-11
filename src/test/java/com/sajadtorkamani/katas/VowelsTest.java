package com.sajadtorkamani.katas;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

// https://www.codewars.com/kata/vowel-count/train/java
public class VowelsTest {
    @Test
    public void getCount_returnsCorrectVowelsCount() {
        assertEquals(5, Vowels.getCount("abracadabra"));
        assertEquals(2, Vowels.getCount("planet"));

        assertEquals(0, Vowels.getCount("bdgh"));
    }
}