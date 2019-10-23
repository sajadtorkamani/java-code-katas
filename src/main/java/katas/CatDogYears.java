package katas;

import java.util.Map;

class CatDogYears {
    private static Map<String, Integer> CAT_YEARS = Map.of("first", 15, "second", 9, "nth", 4);
    private static Map<String, Integer> DOG_YEARS = Map.of("first", 15, "second", 9, "nth", 5);

    static int[] ownedCatAndDog(int catYears, int dogYears) {
        return new int[]{
            ownedYears(catYears, CAT_YEARS),
            ownedYears(dogYears, DOG_YEARS)
        };

    }

    private static int ownedYears(int years, Map<String, Integer> yearsMap) {
        var first = yearsMap.get("first");
        var second = yearsMap.get("second");
        var nth = yearsMap.get("nth");

        if (years > first + second) {
            return 2 + ((years - (first + second)) / nth);
        }

        if (years == first + second) {
            return 2;
        }

        return years >= first ? 1 : 0;
    }
}
