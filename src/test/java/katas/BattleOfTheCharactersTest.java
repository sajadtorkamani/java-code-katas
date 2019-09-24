package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BattleOfTheCharactersTest {
    @Test
    void battle_returnsCorrectWinner() {
        test("AAA", "Z", "Z");
        test("ONE", "TWO", "TWO");
        test("ONE", "NEO", "Tie!");
        test("FOUR", "FIVE", "FOUR");
    }

    private void test(final String x, final String y, final String expected) {
        assertEquals(expected, BattleOfTheCharacters.battle(x, y));
    }
}
