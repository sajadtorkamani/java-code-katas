package katas;

import java.util.Arrays;
import java.util.Comparator;

class SortedCards {
    String[] sortCards(String[] cards) {
        Arrays.sort(cards, new CardComparator());

        return cards;
    }
}

class CardComparator implements Comparator<String> {
    @Override
    public int compare(String card1, String card2) {
        var cardRanks = "A23456789TJQK";

        if (card1.equals(card2)) {
            return 0;
        }

        return cardRanks.indexOf(card1) < cardRanks.indexOf(card2) ? -1 : 1;
    }
}
