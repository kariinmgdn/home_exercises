package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class testDatePeriod {
    public static void main(String[] args) {
        LocalDate start1 = LocalDate.of(2019, 1, 1);
        LocalDate end1 = LocalDate.of(2021, 1, 1);
        DatePeriod datePeriod1 = new DatePeriod(start1, end1);

        LocalDate start2 = LocalDate.of(2019,1,1);
        LocalDate end2 = LocalDate.of(2020,1,1);
        DatePeriod datePeriod2 = new DatePeriod(start2, end2);

        System.out.println(datePeriod1.intersection(datePeriod2));
    }
}
