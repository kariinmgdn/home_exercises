package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person{
    private double gpa;

    public Student(String name, String surname, String address, int id, double gpa) {
        super(name, surname, address, id);
        this.gpa = gpa;
    }

    public Student(String name, String surname, String address, int id) {
        super(name, surname, address, id);
    }

    @Override
    public void display() {
        System.out.println("Student: " + getName() + " " + getSurname() + " (GPA: " + getGpa() + ")\n" + "id: " + getId() + ", address: " + getAddress());
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
