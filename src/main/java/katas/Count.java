package katas;

import java.util.regex.Pattern;

public class Count {
    public static int count(String str, char letter) {
        var count = Pattern
            .compile(String.valueOf(letter))
            .matcher(str)
            .results()
            .count();

        return (int) count;
    }
}
