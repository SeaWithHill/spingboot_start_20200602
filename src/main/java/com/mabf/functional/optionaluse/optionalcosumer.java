package com.mabf.functional.optionaluse;

import com.mabf.entity.Book;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class optionalcosumer {
    public static void main(String[] args) {
        Book book = new Book("1拼一枪", "12323");
        Optional<Book> optionalBook = Optional.of(book);
        optionalBook.ifPresent(book1 -> System.out.println(book1.getTitle()));
        optionalBook.ifPresent(new Consumer<Book>() {
            @Override
            public void accept(Book book) {
                System.out.println(book.getTitle());
            }
        });
        optionalBook.orElse(new Book("1", "123"));
        optionalBook.orElseGet(new Supplier<Book>() {
            @Override
            public Book get() {
                return new Book("1", "123");
            }
        });
        optionalBook.filter(new Predicate<Book>() {
            @Override
            public boolean test(Book book) {
                return book.getTitle() != null;
            }
        }).ifPresent(new Consumer<Book>() {
            @Override
            public void accept(Book book) {
                System.out.println(book.getTitle());
            }
        });
        System.out.println(optionalBook.map(new Function<Book, String>() {
            @Override
            public String apply(Book book) {
                return book.getIsbn();
            }
        }));

    }
}
