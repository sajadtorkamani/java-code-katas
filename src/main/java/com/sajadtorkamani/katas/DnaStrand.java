package com.sajadtorkamani.katas;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

class DnaStrand {
    static String makeComplement(String str) {
        return Pattern
            .compile("[ATCG]")
            .matcher(str)
            .replaceAll((MatchResult match) -> {
                switch (match.group()) {
                    case "A": return "T";
                    case "T": return "A";
                    case "C": return "G";
                    case "G": return "C";
                    default: return match.group(); // Just to make compiler happy
                }
            });
    }
}
