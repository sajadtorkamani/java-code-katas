package katas;

import java.util.stream.Collectors;

public class Switcheroo {
    public static String switcheroo(String str) {
        return str.chars()
                .mapToObj(Character::toString)
                .map(Switcheroo::switchPositions)
                .collect(Collectors.joining());
    }

    public static String switchPositions(String character) {
        if (character.equals("a")) {
            return "b";
        } else if (character.equals("b")) {
            return "a";
        }

        return character;
    }
}
