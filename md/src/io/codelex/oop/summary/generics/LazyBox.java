package io.codelex.oop.summary.generics;

import java.util.function.Supplier;

public class LazyBox<T> {

    private T item;
    private final Supplier<T> function;

    public LazyBox(Supplier<T> function) {
        this.function = function;
    }

    public T getItem() {
        if (item == null) {
            item = function.get();
        }
        return item;
    }
}
