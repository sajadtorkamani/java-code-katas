package katas;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseTest {
    @Test
    public void cAmEl_returnsCorrectResult() {
        assertEquals("TeSt", CamelCase.cAmEl("test"));
        assertEquals("", CamelCase.cAmEl(""));
        assertEquals("TeSt", CamelCase.cAmEl("TEST"));
        assertEquals("TeSt", CamelCase.cAmEl("Test"));
        assertEquals("TeSt", CamelCase.cAmEl("tEsT"));
        assertEquals("IdOnTeVeN", CamelCase.cAmEl("IDOntEvEN"));
    }
}
