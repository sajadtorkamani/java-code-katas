package com.sajadtorkamani.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JadenCaseTest {
    @Test
    void toJadenCase_capitalizes_each_word() {
        assertEquals( "Most Trees Are Blue", new JadenCase().toJadenCase("most trees are blue"));
    }

    @Test
    void toJadenCase_handles_null_inputs() {
        assertNull(new JadenCase().toJadenCase(null));
    }

    @Test
    void toJadenCase_handles_empty_inputs() {
        assertNull(new JadenCase().toJadenCase(""));
    }
}
