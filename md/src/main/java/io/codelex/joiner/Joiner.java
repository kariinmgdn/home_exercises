package io.codelex.joiner;

import java.util.List;
import java.util.function.BiFunction;

public class Joiner <T> {

    private List<T> items;
    private BiFunction <String, T, String> function;


    public Joiner(String separator, BiFunction<String, T, String> function) {
        this.function = function;
    }

    public String join() {
        String result = items.get(0).toString();
        for (int i = 1; i < items.size(); i++) {
            result = function.apply(result, items.get(i));
        }
        return result;
    }
}
