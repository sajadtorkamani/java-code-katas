package katas;

class BattleOfTheCharacters {
    static String battle(String a, String b) {
        int aScore = calculateScore(a);
        int bScore = calculateScore(b);

        if (aScore == bScore) {
            return "Tie!";
        }

        return aScore > bScore ? a : b;
    }

    private static int calculateScore(String str) {
        return str.chars().sum() - (str.length() * 64);
    }
}
