package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class Exercise2 {
    public static void main(String[] args) {
        updates(2022, 6, 1, 2022, 9);
    }

    private static void updates(int year, int month, int day, int updateYear, int updateMonth) {
        LocalDate launchDate = LocalDate.of(year, month, day);
        while (launchDate.isBefore(LocalDate.of(updateYear, updateMonth + 1, 1))) {

            if (launchDate.getYear() == updateYear && launchDate.getMonthValue() == updateMonth) {
                System.out.println(launchDate);
            }
            launchDate = launchDate.plusDays(14);

        }
    }
}
