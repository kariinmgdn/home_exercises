package io.codelex.oop.persons;

public class PersonsTest {
    public static void main(String[] args) {
        Employee employee = new Employee("name", "surname", "id123", 35, "accountant");
        employee.startedWorking(2012, 3, 22);
        System.out.println(employee.getInfo());

        Customer customer = new Customer("Peter", "Brown", "123ABC22", 2, "CID1234", 5);
        System.out.println(customer.getInfo());
        customer.setPurchaseCount(10);
        System.out.println(customer.getInfo());
    }
}
