package com.sajadtorkamani.katas;

class Spooner {
    String spoonerize(String str) {
        String[] words = str.split(" ");
        String word1 = words[0];
        String word2 = words[1];

        return String.format(
            "%s %s",
            word2.charAt(0) + word1.substring(1),
            word1.charAt(0) + word2.substring(1)
        );
    }
}
