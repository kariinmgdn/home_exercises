package io.codelex.classesandobjects.practice;

import java.time.LocalDate;

public class AuthorTest {
    public static void main(String[] args) {
        Author lewisCarrol = new Author("Lewis", "Carroll", LocalDate.of(1832, 1, 27));
        String book1 = "Alice in Wonderland";
        String book2 = "Walrus and the Carpenter";
        lewisCarrol.addBook(book1);
        lewisCarrol.addBook(book2);

        System.out.println("There are totally about " + Author.BOOKS_IN_THE_WORLD + " books in the world.");
        long age = lewisCarrol.getAge();
        System.out.println("Author's age: " + age);
        System.out.println(lewisCarrol.getFullName());
        System.out.println(lewisCarrol); //Teksts ko izvada šī rindiņa drīkst nedaudz atšķirties (citi mainīgie nosaukumi, citādāk izvadītas grāmatas u.tml.)
        if (lewisCarrol.hasWrittenBook("Alice in Wonderland")) {
            System.out.println("He has written the book Alice in Wonderland!");
        }
        if (lewisCarrol.hasWrittenBook("Titanic")) {
            System.out.println("He has written the book Titanic!");
        } else {
            System.out.println("He has not written the book Titanic!");
        }

        System.out.println("==============================");
        lewisCarrol.printAllInfo();
    }
}
