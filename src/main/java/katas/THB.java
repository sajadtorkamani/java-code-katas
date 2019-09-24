package katas;

class THB {
    String clean(String str) {
        if (str == null) {
            return "";
        }

        return str.replaceAll("[^TtHhBb]", "");
    }
}
