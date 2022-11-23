package io.codelex.dateandtime.practice;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise1 {
    public static void main(String[] args) throws ParseException {
        workingH(2022, 11, 11, 2022, 11, 22);
        workingH(2022, 11, 22, 2022, 11, 11);
    }

    private static void workingH(int year1, int month1, int day1, int year2, int month2, int day2) {
        int count = 0;
        LocalDate start = LocalDate.of(year1, month1, day1);
        LocalDate end = LocalDate.of(year2, month2, day2);

        if (start.isAfter(end)) {
            LocalDate tempDate;
            tempDate = start;
            start = end;
            end = tempDate;
        }
        end = end.plusDays(1);

        while (start.isBefore(end)) {
            if (DayOfWeek.SATURDAY != start.getDayOfWeek() && DayOfWeek.SUNDAY != start.getDayOfWeek()) {
                count++;
            }
            start = start.plusDays(1);
        }
        System.out.println(count * 8);
    }
}
