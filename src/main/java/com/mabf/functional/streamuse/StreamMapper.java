package com.mabf.functional.streamuse;

import java.util.ArrayList;
import java.util.List;

public class StreamMapper {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.stream().map(s -> Integer.valueOf(s)).forEach(s -> System.out.println(s));
    }
}
