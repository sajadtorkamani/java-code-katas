package com.sajadtorkamani.katas;

import java.util.regex.Pattern;

class Troll {
    static String disemvowel(String str) {
        return Pattern
            .compile("[aeiou]", Pattern.CASE_INSENSITIVE)
            .matcher(str)
            .replaceAll("");
    }
}
