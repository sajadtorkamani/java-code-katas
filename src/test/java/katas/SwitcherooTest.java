package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitcherooTest {
    @Test
    public void switcheroo_returnsCorrectResult() {
        assertEquals("abc", Switcheroo.switcheroo("bac"));
        assertEquals("ccc", Switcheroo.switcheroo("ccc"));
        assertEquals("aaabcccbaaa", Switcheroo.switcheroo("bbbacccabbb"));
    }
}
