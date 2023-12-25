package katas;


public class AsciiWeight {
    public static int getWeight(String name) {
        return name
                .chars()
                .filter(Character::isLetter)
                .map(character -> switchCase((char) character))
                .sum();
    }

    private static char switchCase(Character character) {
        if (Character.isUpperCase(character)) {
            return Character.toLowerCase(character);
        } else {
            return Character.toUpperCase(character);
        }
    }
}
