package katas;

class GetMiddle {
    static String getMiddle(String str) {
        int middleIndex = str.length() / 2;

        return str.length() % 2 == 0
            ? "" + str.charAt(middleIndex - 1) + str.charAt(middleIndex)
            : String.valueOf(str.charAt(middleIndex));
    }
}
