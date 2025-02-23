package com.mabf.functional.streamuse;

import java.util.ArrayList;
import java.util.List;

public class StreamDistinct {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("1");
        list.stream()
                .distinct()
                .forEach(s -> System.out.println(s)
        );
    }
}
