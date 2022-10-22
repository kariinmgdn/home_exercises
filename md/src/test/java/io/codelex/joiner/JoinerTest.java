package io.codelex.joiner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JoinerTest {

    @Test
    void joinInt() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        Joiner<Integer> joiner = new Joiner<>(integers, "-");
        Assertions.assertEquals("1-2-3", joiner.join());
    }

    @Test
    void joinString() {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        Joiner<String> joiner = new Joiner<>(stringList, "-");
        Assertions.assertEquals("a-b-c", joiner.join());
    }
}
