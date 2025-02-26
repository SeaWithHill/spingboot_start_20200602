package com.mabf.functional.streamuse;

import java.util.Optional;
import java.util.stream.Stream;

public class streamparalel {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> reduce = integerStream
                .parallel()
                .filter(integer -> integer > 5).reduce((integer, integer2) -> integer + integer2);
        reduce.ifPresent(integer -> System.out.println(integer));

    }
}
