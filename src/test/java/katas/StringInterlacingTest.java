package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/string-interlacing/train/java
public class StringInterlacingTest {
    @Test
    void interlace_handlesSameLengthWords() {
        assertEquals("HWeolrllod", StringInterlacing.interlace("Hello", "World"));
    }

    @Test
    void interlace_handlesDifferentLengthWords() {
        assertEquals("sGoimmemleoGviimnm'e", StringInterlacing.interlace("Gimme", "some lovin'"));
    }

    @Test
    void getCharAtIndex_returnsCharAtIndex() {
        assertEquals('s', StringInterlacing.getCharAtIndex("sajad", 0));
        assertEquals('j', StringInterlacing.getCharAtIndex("sajad", 2));
    }

    @Test
    void getCharAtIndex_handlesOutOfBoundsIndex() {
        assertEquals('s', StringInterlacing.getCharAtIndex("sajad", 5));
        assertEquals('j', StringInterlacing.getCharAtIndex("sajad", 2));
    }
}
