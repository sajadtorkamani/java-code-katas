package katas;

import java.util.Arrays;
import java.util.Comparator;

class SortedCards {
    private final static String RANKS = "A23456789TJQK";

    String[] sortCards(String[] cards) {
        Arrays.sort(cards, Comparator.comparingInt(RANKS::indexOf));

        return cards;
    }
}

