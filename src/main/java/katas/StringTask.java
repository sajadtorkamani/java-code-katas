package katas;

class StringTask {
    static String perform(String str) {
        return str
            .toLowerCase()
            .replaceAll("[aeiouy]", "")
            .replaceAll("(\\w)", ".$1");
    }
}
