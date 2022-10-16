package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2<T> {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(15);

        System.out.println(concatenate(integers));

        List<String> stringList = new ArrayList<>();
        stringList.add("word");
        stringList.add("another word");

        System.out.println(concatenate(stringList));

        List<Object> objects = new ArrayList<>();
        objects.add(integers);
        objects.add(stringList);

        System.out.println(concatenate(objects));

    }

    private static String concatenate(List<?> list) {
        StringBuilder result;
        String separator;

        if (list.get(0) instanceof String) {
            result = new StringBuilder("String:");
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = new StringBuilder("Integers:");
            separator = "+";
        } else {
            result = new StringBuilder("Objects:");
            separator = " - ";
        }
        for (Object el : list)
            result.append(separator).append(el.toString());
        return result.toString();
    }
}
