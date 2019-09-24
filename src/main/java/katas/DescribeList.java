package katas;

import java.util.List;

class DescribeList {
    static String describeList(List<Object> list) {
        switch (list.size()) {
            case 0: return "empty";
            case 1: return "singleton";
            default: return "longer";
        }
    }
}
