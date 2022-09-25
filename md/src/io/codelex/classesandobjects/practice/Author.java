package io.codelex.classesandobjects.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Author {

    public static final int BOOKS_IN_THE_WORLD =  129864880;
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final List<String> allBooks = new ArrayList<>();
    public int getAge() {
        return 2022-dateOfBirth.getYear();
    }
    public Author(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public List<String> getAllBooks() {
        return allBooks;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void addBook (String book) {
        allBooks.add(book);
    }
    public boolean hasWrittenBook(String book) {
        for (int i = 0; i < allBooks.size(); i++) {
            if(allBooks.get(i).equals(book)) {
                return true;
            }
        }
        return false;
    }
    public void printAllInfo() {
        System.out.println("Author " + getFullName() + "\nHis age is " + getAge() + " at the moment\nHe has written " +allBooks.size()+ " books.");
    }
    public String toString() {
        return getFirstName()+", "+getLastName()+", "+getAge()+", "+getDateOfBirth()+", "+getAllBooks();
    }

}
