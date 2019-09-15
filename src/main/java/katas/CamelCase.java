package katas;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CamelCase {
    public static String cAmEl(String str) {
        return IntStream.range(0, str.length())
            .mapToObj(index -> {
                String letter = String.valueOf(str.charAt(index));
                return index % 2 == 0 ? letter.toUpperCase() : letter.toLowerCase();
            })
            .collect(Collectors.joining(""));
    }
}
