package io.codelex.oop.summary.ordersAndInvoices;

public class OrderProgram {
    public static void main(String[] args) {
        HouseholdItem sofa = new HouseholdItem("sofa", 15.50, "red");
        FoodItem milk = new FoodItem("milk", 1.34, 11, 11,2022);
        ElectronicsItem radio = new ElectronicsItem("radio", 55.00, 100);
        Order orders = new Order();
        orders.addItem(milk);
        orders.addItem(sofa);
        orders.addItem(radio);
        Invoice invoice = new Invoice(orders, "ABC123");
        System.out.println(invoice);
    }
}
