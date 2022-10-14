package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> stringList = new ArrayList<>();
        //TODO: Add 10 values to list
        for (int i = 1; i <= 10; i++) {
            stringList.add(""+i);
        }
        //TODO: Add new value at 5th position
        stringList.add(4, "A");
        //TODO: Change value at last position (Calculate last position programmatically)
        stringList.set(stringList.size()-1, "B");
        //TODO: Sort your list in alphabetical order
        Collections.sort(stringList);
        //TODO: Check if your list contains "Foobar" element
        if (stringList.contains("Foobar")) {
            System.out.println("contains");
        } else {
            System.out.println("nope");
        }
        //TODO: Print each element of list using loop
        for ( String element: stringList) {
            System.out.println(element);
        }
    }

}
