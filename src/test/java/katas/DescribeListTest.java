package katas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/describe-a-list/train/java
class DescribeListTest {
    @Test
    void describeList_returnsCorrectResult() {
        assertEquals("empty", DescribeList.describeList(Arrays.asList(new Object[0])));
        assertEquals("singleton", DescribeList.describeList(Arrays.asList(1)));
        assertEquals("longer", DescribeList.describeList(Arrays.asList(1, 2)));
        assertEquals("empty", DescribeList.describeList(Arrays.asList(new Object[0])));
        assertEquals("singleton", DescribeList.describeList(Arrays.asList(1.5)));
        assertEquals("longer", DescribeList.describeList(Arrays.asList(1.5, 2.5)));
    }
}
