package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class THBTest {
    @Test
    void clean_returnsCorrectResult() {
        THB thb = new THB();

        assertEquals("thhttttbbttt", thb.clean("For those of you who would like to test your solution before submitting it."));
        assertEquals("", thb.clean(""));
        assertEquals("", thb.clean(null));
    }
}
