package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Blendin Blenjamin", "Blandin", "Year 207012", 123, "Time Anomaly Removal Crew operative");
        Student student = new Student("Mason","Pines", "Piedmont, California", 22222, 10);
        employee.display();
        System.out.println();
        student.display();
    }
}
