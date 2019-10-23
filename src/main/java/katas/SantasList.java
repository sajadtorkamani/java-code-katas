// https://www.codewars.com/kata/santas-naughty-list/train/java
package katas;

import java.util.List;
import java.util.stream.Collectors;

class SantasList {
    static List<String> findChildren(List<String> santasList, List<String> children) {
        return children
            .stream()
            .distinct()
            .filter(child -> santasList.contains(child))
            .sorted()
            .collect(Collectors.toList());
    }
}
