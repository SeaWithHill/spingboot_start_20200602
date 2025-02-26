package com.mabf.functional.optionaluse;


import com.mabf.entity.Author;

import java.util.Optional;

public class optionalorelse {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Throwable {
        Optional<Author> authorOptional = Optional.ofNullable(new Author("Steve", 11));
        Author steve = authorOptional.orElseGet(() -> new Author("Steve", 11));
        System.out.println(steve);
        authorOptional.orElseThrow(() -> new Throwable());
        authorOptional.isPresent();


    }
}

