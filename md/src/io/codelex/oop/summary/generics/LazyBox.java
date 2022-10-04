package io.codelex.oop.summary.generics;

import java.util.List;

public class LazyBox<O extends Object> {
    private Object object;
    private List<Object> box;

    public Object get() {
        box.add(getObject());
        return box;
    }

    public Object getObject() {
        return object;
    }
}
