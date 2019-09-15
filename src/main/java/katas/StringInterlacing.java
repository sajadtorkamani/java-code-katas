package katas;

import java.util.Comparator;
import java.util.List;

class StringInterlacing {
    static String interlace(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        String[] sortedWords = List.of(word1, word2)
            .stream()
            .map(str -> str.replaceAll("\\s", ""))
            .sorted(Comparator.comparingInt(String::length).reversed())
            .toArray(String[]::new);

        String longerWord = sortedWords[0];
        String shorterWord = sortedWords[1];

        for (int i = 0; i < longerWord.length(); i++) {
            result
                .append(getCharAtIndex(longerWord, i))
                .append(getCharAtIndex(shorterWord, i));
        }

        return result.toString();
    }

    /**
     * Safely retrieve char at index by handling out of bounds indices.
     */
    static char getCharAtIndex(String str, int index) {
        int safeIndex = index >= str.length() ? index % str.length() : index;

        return str.charAt(safeIndex);
    }
}
