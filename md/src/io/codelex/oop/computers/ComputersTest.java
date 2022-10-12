package io.codelex.oop.computers;

public class ComputersTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel i3","8GB","Intel UHD Graphics","Asus","Vivokook");
        Computer computer2 = new Computer("Intel i5","8GB","Intel Iris Xe Graphics","Lenovo","IdeaPad");
        Computer computer3 = new Computer("Intel i3","8GB","Intel UHD Graphics","Asus","Vivokook");
        Laptop laptop1 = new Laptop("Intel i3","8GB","Intel UHD Graphics","Asus","Vivokook", "a");
        Laptop laptop2 = new Laptop("Intel i3","8GB","Intel UHD Graphics","Asus","Vivokook", "a");

        System.out.println(computer1.hashCode());
        System.out.println(computer2.hashCode());
        System.out.println(computer1.equals(computer2));
        System.out.println(computer1.equals(computer3));
        System.out.println(computer1);
        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptop1);
    }
}
