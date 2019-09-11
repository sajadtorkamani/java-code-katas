package com.sajadtorkamani.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpoonerTest {
    @Test
    void spoonerize_swaps_first_letter_of_both_words() {
        Spooner spooner = new Spooner();
        assertEquals("pit nicking", spooner.spoonerize("nit picking"));
        assertEquals("bedding wells", spooner.spoonerize("wedding bells"));
        assertEquals("belly jeans", spooner.spoonerize("jelly beans"));
    }
}
