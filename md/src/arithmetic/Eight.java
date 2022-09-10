package io.codelex.arithmetic;

public class Eight {
    public static void main(String[] args) {
        employee("empoyee1",7.5, 35);
        employee("empoyee2",8.2, 47);
        employee("empoyee3",10.0, 73);
    }
    private static void employee(String emp, double basePay, int hoursWorked) {
        double overtimePay;
        double salary;
        if (basePay<8 || hoursWorked>60) {
            System.out.println(emp + ": error");
        } else if (hoursWorked>40) {
            overtimePay = (hoursWorked - 40) * basePay * 1.5;
            salary = 40 * basePay + overtimePay;
            System.out.println(emp + ": " + salary);
        } else if (hoursWorked <= 40) {
            salary = basePay * hoursWorked;
            System.out.println(emp + ": " + salary);
        }
    }
}
