package com.sajadtorkamani.katas;

import java.util.function.IntUnaryOperator;

public class AdderFactory {
    public static IntUnaryOperator create(int initialNum) {
        return num -> initialNum + num;
    }
}
