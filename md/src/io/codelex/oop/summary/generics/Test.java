package io.codelex.oop.summary.generics;

public class Test {
    public static void main(String[] args) {
        Printer printer = new Printer("maaaaaa");
        printer.print();

        StorageHouse storageHouse = new StorageHouse(26);
        storageHouse.addMoreItems("kkas");
        storageHouse.printItems();

        LazyBox<Integer> box = new LazyBox<>(Test::calculate);

        Integer contents = box.getItem();

        Integer contents2 = box.getItem();
    }

    public static Integer calculate() {
        return 200;
    }
}
