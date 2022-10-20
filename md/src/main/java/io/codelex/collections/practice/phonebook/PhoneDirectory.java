package main.java.io.codelex.collections.practice.phonebook;

import java.util.*;

public class PhoneDirectory {
    private final TreeMap<String, String> numbers = new TreeMap<>();

    private int find(String name) {
        for (int i = 0; i < numbers.size(); i++) {
            if (getElement(i).getKey().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return null;
        } else {
            return getElement(position).getValue();
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        int i = find(name);
        if (i >= 0) {
            numbers.put(getElement(i).getKey(), number);
        } else {
            PhoneEntry newEntry = new PhoneEntry();  // Create a new pair.
            newEntry.name = name;
            newEntry.number = number;
            numbers.put(newEntry.name, newEntry.number);   // Add the new pair to the array.
        }
    }

    private Map.Entry<String, String> getElement(int num) {
        Set<Map.Entry<String, String>> entrySet= numbers.entrySet();
        Map.Entry[] arr = entrySet.toArray(new Map.Entry[0]);
        return arr[num];
    }
}
