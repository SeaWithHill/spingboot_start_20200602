package com.mabf.functional.streamuse;

import java.util.ArrayList;
import java.util.List;

public class StreamUsage {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("age");
        list.stream()
                .distinct().
                filter(s -> s.length() > 3)
                .forEach(s -> System.out.println(s));
    }
}
