package katas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeInDays {
    public static String ageInDays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        long daysBetween = ChronoUnit.DAYS.between(birthday, LocalDate.now());

        return String.format("You are %d days old", daysBetween);
    }
}
