package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class IntList extends AbstractList{

    List<Integer> integerList = new ArrayList<>();

    @Override
    public void add(int i, Object el) {
        integerList.add(i, (Integer) el);
    }

    @Override
    public Object get(int i) {
        return integerList.get(i);
    }
}
