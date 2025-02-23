package com.mabf.functional.streamuse;

import java.util.ArrayList;
import java.util.List;

public class StreamSorted {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("1");
        list.add("2");
        list.stream().distinct().sorted().forEach(s -> System.out.println(s));

    }
}
