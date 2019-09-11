package com.sajadtorkamani.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DnaStrandTest {
    @Test
    void makeComplement_returns_correct_DNA_complement() {
//        assertEquals(DnaStrand.makeComplement("AAAA"), "TTTT");
        assertEquals(DnaStrand.makeComplement("ATTGC"), "TAACG");
        assertEquals(DnaStrand.makeComplement("GTAT"), "CATA");
    }
}
