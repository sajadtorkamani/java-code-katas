// https://www.codewars.com/kata/cat-years-dog-years-2/train/java
package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CatDogYearsTest {
    @Test
    void ownedCatAndDog_returnsCorrectResult() {
        assertArrayEquals(new int[]{1,1}, CatDogYears.ownedCatAndDog(15,15));
        assertArrayEquals(new int[]{2,2}, CatDogYears.ownedCatAndDog(24,24));
        assertArrayEquals(new int[]{10,10}, CatDogYears.ownedCatAndDog(56,64));
    }
}
