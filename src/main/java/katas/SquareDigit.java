package katas;

import java.util.Arrays;
import java.util.stream.Collectors;

class SquareDigit {
    int squareDigits(int num) {
        String[] digits = String
            .valueOf(num)
            .split("");

        String result = Arrays.stream(digits)
            .map(digit -> {
                int square = (int) Math.pow(Integer.parseInt(digit), 2);
                return String.valueOf(square);
            })
            .collect(Collectors.joining());

        return Integer.parseInt(result);
    }
}
