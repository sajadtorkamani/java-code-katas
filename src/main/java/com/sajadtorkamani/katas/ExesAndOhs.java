package com.sajadtorkamani.katas;

import java.util.regex.Pattern;

class ExesAndOhs {
    static boolean getXO(String str) {
        return getLetterCount(str, "x") == getLetterCount(str, "o");
    }

    private static int getLetterCount(String str, String letter) {
        return (int) Pattern
            .compile(letter, Pattern.CASE_INSENSITIVE)
            .matcher(str)
            .results()
            .count();
    }
}
