package com.sajadtorkamani.katas;

import java.util.Arrays;
import java.util.Comparator;

class HighAndLow {
    static String highAndLow(String str) {
        String[] nums = str.split(" ");

        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String a, String b) {
                return Integer.valueOf(a).compareTo(Integer.valueOf(b));
            }
        });

        return String.format("%s %s", nums[nums.length - 1], nums[0]);
    }
}
