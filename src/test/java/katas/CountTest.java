package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/counting-characters/train/java
public class CountTest {
    @Test
    public void count_returnsCorrectCount() {
        assertEquals(2, Count.count("java", 'a'));
        assertEquals(3, Count.count("javaa", 'a'));
        assertEquals(0, Count.count("javaa", 'p'));
    }
}
