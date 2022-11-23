package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod datePeriod) {

        LocalDate startResult;
        LocalDate endResult;

        if (end.isBefore(datePeriod.start) || datePeriod.end.isBefore(start)) {
            return null;
        }

        if (start.isBefore(datePeriod.start) || start.isEqual(datePeriod.start)) {
            startResult = datePeriod.start;
        } else {
            startResult = start;
        }

        if (end.isBefore(datePeriod.end) || end.isEqual(datePeriod.end)) {
            endResult = end;
        } else {
            endResult = datePeriod.end;
        }

        return new DatePeriod(startResult, endResult);
    }

    @Override
    public String toString() {
        return start + " - " + end;
    }
}
