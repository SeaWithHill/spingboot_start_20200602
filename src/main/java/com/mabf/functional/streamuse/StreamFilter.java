package com.mabf.functional.streamuse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilter {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return Integer.valueOf(s) > 1;
            }
        }).forEach(s -> System.out.println(s));
    }
}
