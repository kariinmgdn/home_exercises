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

        if (getEnd().isBefore(datePeriod.start) || datePeriod.getEnd().isBefore(getStart())) {
            return null;
        }
        
        if (getStart().isBefore(datePeriod.start) || getStart().isEqual(datePeriod.start)) {
            startResult = datePeriod.start;
        } else {
            startResult = getStart();
        }

        if (getEnd().isBefore(datePeriod.end) || getEnd().isEqual(datePeriod.end)) {
            endResult = getEnd();
        } else {
            endResult = datePeriod.end;
        }

        return new DatePeriod(startResult, endResult);
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return getStart() + " - " + getEnd();
    }
}
