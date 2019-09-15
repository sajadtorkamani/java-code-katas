package katas;

import java.util.regex.Pattern;

class Vowels {
    static int getCount(String str) {
        return (int) Pattern
            .compile("[aeiou]")
            .matcher(str)
            .results()
            .count();
    }
}
