package katas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatComparatorTest {
    @Test
    public void testSimpleCase() {
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Lily", 30);
        cats[1] = new Cat("Drake", 15);

        Arrays.sort(cats, new CatWeightComparator());

        assertEquals("Drake", cats[0].name);
        assertEquals("Lily", cats[1].name);
    }
}
