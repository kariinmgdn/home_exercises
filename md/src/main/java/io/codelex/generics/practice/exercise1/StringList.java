package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StringList extends AbstractList{

    List<String> stringList = new ArrayList<>();

    @Override
    public void add(int i, Object el) {
        stringList.add(i, (String) el);
    }

    @Override
    public Object get(int i) {
        return stringList.get(i);
    }
}
