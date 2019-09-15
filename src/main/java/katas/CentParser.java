package katas;

import java.util.regex.Pattern;

public class CentParser {
    public static Integer toCents(String priceStr) {
        boolean isValidPrice = Pattern.compile("^\\$\\d+\\.\\d{2}$").matcher(priceStr).matches();

        if (!isValidPrice) {
            return null;
        }

        double price = Double.parseDouble(priceStr.substring(1));

        return (int) Math.round(price * 100);
    }
}
