package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results

        List<String> stringList = new ArrayList<>(Arrays.asList(array).subList(0, array.length));
        System.out.println(stringList);

        //todo - replace array with a HashSet and print out the results

        Set<String> stringHashSet = new HashSet<>();
        Collections.addAll(stringHashSet, array);
        System.out.println(stringHashSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results

        Map<String, String> stringMap = new HashMap<>();
        for (String s : array) {
            if (s.equals("Audi") || s.equals("BMW") || s.equals("Mercedes") || s.equals("VolksWagen")) {
                stringMap.put(s, "Germany");
            } else if (s.equals("Honda")) {
                stringMap.put(s, "Japan");
            } else {
                stringMap.put(s, "USA");
            }
        }
        System.out.println(stringMap);
    }

}
