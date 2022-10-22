package io.codelex.joiner;

import java.util.List;
import java.util.stream.Collectors;

public class Joiner<T> {
    List<T> list;

    public Joiner(List<T> list, String separator) {
        this.list = list;
        this.separator = separator;
    }

    private final String separator;


    public String join() {
        return list.stream().map(Object::toString).collect(Collectors.joining(separator));
    }
}
