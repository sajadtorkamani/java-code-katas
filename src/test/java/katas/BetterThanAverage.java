package katas;

import java.util.ArrayList;

public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoint) {
        var points = new ArrayList<Integer>();

        for (int point : classPoints) {
            points.add(point);
        }
        points.add(yourPoint);

        var average = points.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        return yourPoint > average;
    }
}
