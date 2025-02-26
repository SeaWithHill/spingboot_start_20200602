package com.mabf.functional.optionaluse;

import com.mabf.entity.Author;
import com.mabf.entity.Book;

import java.util.ArrayList;
import java.util.Optional;

public class optionalmap {
    public static void main(String[] args) {
        Author author1 = new Author("Al", 123);
        Book book1 = new Book("拼一枪", "12323");
        Book book2 = new Book("1拼一枪", "12323");
        Book book3 = new Book("2拼一枪", "12323");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        author1.setBooks(books);
        Optional<Author> optionalAuthor = Optional.of(author1);
        optionalAuthor.map(author -> author.getBooks())
                .ifPresent(books1 -> books1.forEach(book -> System.out.println(book.getTitle())));


    }
}
