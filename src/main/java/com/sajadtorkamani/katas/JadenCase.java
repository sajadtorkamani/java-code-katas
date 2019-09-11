package com.sajadtorkamani.katas;

import java.util.Arrays;
import java.util.stream.Collectors;

class JadenCase {
    String toJadenCase(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        return Arrays
            .stream(str.split(" "))
            .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
            .collect(Collectors.joining(" "));
    }
}
