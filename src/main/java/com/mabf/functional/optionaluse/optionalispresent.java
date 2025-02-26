package com.mabf.functional.optionaluse;

import com.mabf.entity.Author;

import java.util.Optional;

public class optionalispresent {
    public static void main(String[] args) {
        Optional author = Optional.of(new Author("Al", 123));
        author.isPresent();
    }
}
