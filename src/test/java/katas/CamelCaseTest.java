package katas;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseTest {
    @Test
    public void testCamelBasic() {
        assertEquals("TeSt",
                CamelCase.cAmEl("test"));
    }

    @Test
    public void testCamelEmpty() {
        assertEquals("",
                CamelCase.cAmEl(""));
    }

    @Test
    public void testCamelAllCaps() {
        assertEquals("TeSt",
                CamelCase.cAmEl("TEST"));
    }

    @Test
    public void testCamelStartWithCapital() {
        assertEquals("TeSt",
                CamelCase.cAmEl("Test"));
    }

    @Test
    public void testCamelStartWithInvertedCamel() {
        assertEquals("TeSt",
                CamelCase.cAmEl("tEsT"));
    }

    @Test
    public void testCamelOtherWord() {
        assertEquals("IdOnTeVeN",
                CamelCase.cAmEl("IDOntEvEN"));
    }
}
