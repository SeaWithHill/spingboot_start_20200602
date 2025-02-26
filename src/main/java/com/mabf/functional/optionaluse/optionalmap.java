package com.mabf.functional.optionaluse;

import com.mabf.entity.Author;

import java.util.Optional;
import java.util.function.Consumer;

public class optionalispresent {
    public static void main(String[] args) {
        Optional author = Optional.of(new Author("Al", 123));
        author.isPresent(new Consumer<>() {
            @Override
            public void accept(Object o) {

            }
        });
    }
}
