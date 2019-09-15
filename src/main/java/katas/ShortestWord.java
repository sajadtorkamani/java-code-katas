package katas;

import java.util.Arrays;

class ShortestWord {
    static int findShort(String str) {
        String[] words = str.split(" ");

        return Arrays.stream(words)
            .mapToInt(String::length)
            .min()
            .getAsInt();
    }
}
