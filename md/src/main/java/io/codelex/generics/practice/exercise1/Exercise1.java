package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 <T> {
    private final List<Object> list = new ArrayList<>();

    public Exercise1() {
    }

    public <T> void add(int i, T el) {
        list.add(i, el);
    }

    public Object get(int i) {
        return list.get(i);
    }

    public String concatenate() {
        StringBuilder result = new StringBuilder();
        String separator = "";
        for (Object obj : list) {
             if (obj instanceof Integer) {
                result = new StringBuilder("Integer:");
                separator = "+";
            }else if (obj instanceof String) {
                result = new StringBuilder("String:");
                separator = " ";
            }
        }

        for (Object el : list)
            result.append(separator).append(el.toString());
        return result.toString();
    }
}
