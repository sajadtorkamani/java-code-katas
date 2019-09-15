package katas;

public class Multiplier {
    public static int multiply(int a, int b) {
        long result = (long) a * b;

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException();
        }

        return (int) result;
    }
}
