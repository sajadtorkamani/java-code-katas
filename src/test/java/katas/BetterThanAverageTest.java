package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BetterThanAverageTest {
    @Test
    public void betterThanAverage_returnsCorrectResult() {
        assertEquals(true, BetterThanAverage.betterThanAverage(new int[]{2, 3}, 5));
        assertEquals(true, BetterThanAverage.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, BetterThanAverage.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, BetterThanAverage.betterThanAverage(new int[]{100, 90}, 11));
    }
}
