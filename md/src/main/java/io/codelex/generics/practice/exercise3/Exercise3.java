package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3<V> {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("word");

        List<Object> objects = new ArrayList<>();

        addAllX(stringList, objects);
        //addAllY(stringList, objects);
    }

    public void add(V value, List<V> list) {
        list.add(value);
    }

    public static  <V> void addAllX(List<V> v, List<? super V> l) {
        l.addAll(v);
    }

    public static  <V> void addAllY(List<V> v, List<V> l) {
        l.addAll(v);
    }
}
