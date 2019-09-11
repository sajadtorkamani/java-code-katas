package com.sajadtorkamani.katas;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Accumul {
    static String accum(String str) {
        String[] letters = str.toLowerCase().split("");

        return IntStream.range(0, str.length())
            .mapToObj(index -> letters[index].toUpperCase() + letters[index].repeat(index))
            .collect(Collectors.joining("-"));
    }
}
