package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {
    @Test
    void paste_createsDoubleFromInputs() {
        assertEquals(50.85, Numbers.paste(50, 85));
    }
}
