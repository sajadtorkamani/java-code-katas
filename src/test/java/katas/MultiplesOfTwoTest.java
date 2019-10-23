package katas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplesOfTwoTest {
    @Test
    void findMultiples_returnsCorrectResult1() {
        List<Integer> actual = MultiplesOfTwo.findMultiples(5,13,800);
        List<Integer> expected = new ArrayList<>(Arrays.asList(65, 130, 195, 260, 325, 390, 455, 520, 585, 650, 715, 780));
        assertEquals(expected, actual);
    }

    @Test
    void findMultiples_returnsCorrectResult2() {
        List<Integer> actual = MultiplesOfTwo.findMultiples(2,4,40);
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 8, 12, 16, 20, 24, 28, 32, 36));
        assertEquals(expected, actual);
    }

    @Test
    void findMultiples_returnsCorrectResult3() {
        List<Integer> actual = MultiplesOfTwo.findMultiples(7,16,1000);
        List<Integer> expected = new ArrayList<>(Arrays.asList(112, 224, 336, 448, 560, 672, 784, 896));
        assertEquals(expected, actual);
    }
}
