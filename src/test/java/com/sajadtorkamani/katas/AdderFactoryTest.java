package com.sajadtorkamani.katas;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderFactoryTest {
    @Test
    public void create_returnsCorrectAdderFunction() {
        assertEquals(5, AdderFactory.create(1).applyAsInt(4));
        assertEquals(6, AdderFactory.create(4).applyAsInt(2));
    }
}
