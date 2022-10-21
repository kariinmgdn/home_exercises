package io.codelex.classesandobjects.practice.products1;

public class Products {
    public static void main(String[] args) {
        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);
        product1.setPriceAtStart(55);
        product2.setAmountAtStart(2);
        product1.printProduct();
        product2.printProduct();
        product3.printProduct();
    }
}
