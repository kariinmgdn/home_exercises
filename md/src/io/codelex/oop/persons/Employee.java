package io.codelex.oop.persons;

import java.time.LocalDate;

public class Employee extends Person {
    private final String position;

    private LocalDate startedWorkingDate;

    public Employee(String firstName, String lastName, String id, int age, String position) {
        super(firstName, lastName, id, age);
        this.position = position;
    }

    public void startedWorking(int year, int month, int day) {
        this.startedWorkingDate = LocalDate.of(year, month, day);
    }

    public int getWorkExperience() {
        return LocalDate.now().getYear() - startedWorkingDate.getYear();
    }

    @Override
    public String getInfo() {
        return position + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + " years)";
    }
}
