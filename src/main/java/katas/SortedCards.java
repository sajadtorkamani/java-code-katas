package katas;

import java.util.Arrays;
import java.util.Comparator;

class SortedCards {
    String[] sortCards(String[] cards) {
        var cardRanks = "A23456789TJQK";

        Arrays.sort(cards, Comparator.comparingInt(cardRanks::indexOf));

        return cards;
    }
}

