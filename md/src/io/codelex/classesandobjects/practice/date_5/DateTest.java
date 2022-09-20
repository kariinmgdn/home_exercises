package io.codelex.classesandobjects.practice.date_5;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(18, 12, 2021);
        Date date2 = new Date(1, 10, 2011);
        System.out.println(date1.displayDate());
        System.out.println(date1.getDay());
        date2.setMonth(11);
        System.out.println(date2.displayDate());
    }
}
