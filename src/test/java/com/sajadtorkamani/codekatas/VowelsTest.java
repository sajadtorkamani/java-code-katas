package com.sajadtorkamani.codekatas;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VowelsTest {
    @Test
    public void getCount_returnsCorrectVowelsCount() {
        assertEquals(5, Vowels.getCount("abracadabra"));
        assertEquals(2, Vowels.getCount("planet"));

        assertEquals(0, Vowels.getCount("bdgh"));
    }
}