// https://www.codewars.com/kata/show-multiples-of-2-numbers-within-a-range/train/java
package katas;

import java.util.ArrayList;
import java.util.List;

class MultiplesOfTwo {
    static List<Integer> findMultiples(int a, int b, int limit) {
        List<Integer> multiples = new ArrayList<>();

        for (var num = Math.max(a, b); num < limit; num++) {
            if (num % b == 0 && num % a == 0) {
                multiples.add(num);
            }
        }

        return multiples;
    }
}
