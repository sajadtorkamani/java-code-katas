package com.sajadtorkamani.codekatas;

import java.util.regex.Pattern;

public class Vowels {
    public static int getCount(String str) {
        return (int) Pattern
            .compile("[aeiou]")
            .matcher(str)
            .results()
            .count();
    }
}
