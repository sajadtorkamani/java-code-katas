package katas;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AgeInDaysTest {
    @Test
    public void ageInDays_returnsCorrectResult() {
        LocalDate birthday1 = LocalDate.now().minusDays(2);
        assertEquals("You are 2 days old",
                AgeInDays.ageInDays(birthday1.getYear(), birthday1.getMonthValue(), birthday1.getDayOfMonth()));

        LocalDate birthday2 = LocalDate.now().minusYears(1);
        if (LocalDate.now().isLeapYear()) {
            assertEquals("You are 366 days old",
                    AgeInDays.ageInDays(birthday2.getYear(), birthday2.getMonthValue(), birthday2.getDayOfMonth()));
        } else {
            assertEquals("You are 365 days old",
                    AgeInDays.ageInDays(birthday2.getYear(), birthday2.getMonthValue(), birthday2.getDayOfMonth()));
        }
    }
}