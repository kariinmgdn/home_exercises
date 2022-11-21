package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person{
    private String jobTitle;

    public Employee(String name, String surname, String address, int id, String jobTitle) {
        super(name, surname, address, id);
        this.jobTitle = jobTitle;
    }

    @Override
    public void display() {
        System.out.println("Employee: " + getName() + " " + getSurname() + " (" + getJobTitle() + ")\n" + "id: " + getId() + ", address: " + getAddress());
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
