package com.mabf.functional.streamuse;

import com.mabf.entity.Author;
import com.mabf.entity.Book;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamFlatmap {
    public static void main(String[] args) {
        // 创建五个Author对象，其中两个对象的年龄相同
        Author author1 = new Author("Alice", 30);
        Author author2 = new Author("Bob", 25);
        Author author3 = new Author("Charlie", 35);
        Author author4 = new Author("David", 25); // 年龄与Bob相同
        Author author5 = new Author("Eve", 40);
        // 创建Book对象并设置对应的Author
        Book book1 = new Book("Book One", "123");
        Book book2 = new Book("Book Two", "123");
        Book book3 = new Book("Book Three", "123");
        Book book4 = new Book("Book Four", "123");
        Book book5 = new Book("Book Five", "123");
        book1.setCategory("目录1，目录2");
        book2.setCategory("目录2，目录3");
        book3.setCategory("目录3，目录4");
        book4.setCategory("目录1，目录3");
        book5.setCategory("目录2，目录4");

        author1.setBooks(Arrays.asList(book1, book2, book3));
        author2.setBooks(Arrays.asList(book4, book5));
        List<Author> authors = Arrays.asList(author1, author2, author3, author4, author5);


        authors.stream()
                .map(author -> author.getBooks())
                .forEach(new Consumer<List<Book>>() {
                    @Override
                    public void accept(List<Book> x) {
                        System.out.println(x);
                    }
                });
        authors.stream()
                .flatMap(new Function<Author, Stream<Book>>() {
                    @Override
                    public Stream<Book> apply(Author author) {
                        if (author.getBooks() != null) {
                            return author.getBooks().stream();
                        }
                        return null;

                    }
                })
                .distinct()
                .forEach(new Consumer<Book>() {
                    @Override
                    public void accept(Book book) {
                        System.out.println(book);
                    }
                });
        authors.stream()
                .flatMap(new Function<Author, Stream<Book>>() {
                    @Override
                    public Stream<Book> apply(Author author) {
                        if (author.getBooks() != null) {
                            return author.getBooks().stream();
                        }
                        return null;

                    }
                })
                .distinct()
                .flatMap(new Function<Book, Stream<String>>() {
                    @Override
                    public Stream<String> apply(Book book) {
                        if (book.getCategory() != null) {
                            return Arrays.stream(book.getCategory().split("，"));
                        }
                        return null;
                    }
                })
                .distinct()
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String category) {
                        System.out.println(category);
                    }
                });

    }
}
