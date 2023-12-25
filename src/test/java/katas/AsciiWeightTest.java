package katas;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class AsciiWeightTest {
    @Test
    public void getWeight_returnsCorrectResult() {
        assertEquals(AsciiWeight.getWeight("Joe"), 254);
        assertEquals(AsciiWeight.getWeight("CJ"), 205);
        assertEquals(AsciiWeight.getWeight("cj"), 141);
    }
}
