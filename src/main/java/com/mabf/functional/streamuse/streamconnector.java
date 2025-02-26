package com.mabf.functional.streamuse;

import com.mabf.entity.Author;
import com.mabf.entity.Book;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class streamconnector {
    public static void main(String[] args) {
        // 创建五个Author对象，其中两个对象的年龄相同
        Author author1 = new Author("Alice", 30);
        Author author2 = new Author("Bob", 25);
        Author author3 = new Author("Charlie", 35);
        Author author4 = new Author("David", 25); // 年龄与Bob相同
        Author author5 = new Author("Eve", 40);

        // 将Author对象放入列表中
        List<Author> authors = Arrays.asList(author1, author2, author3, author4, author5);

        authors.stream()
                .filter(new Predicate<Author>() {
                    @Override
                    public boolean test(Author author) {
                        return author.getAge() > 25;
                    }
                }.and(new Predicate<Author>() {
                    @Override
                    public boolean test(Author author) {
                        return author.getAge() < 35;
                    }
                })).forEach(System.out::println);
        Book book = new Book("123", "");
        List<Book> books = Arrays.asList(book);
        books.stream()
                .forEach(new Consumer<Book>() {
                    @Override
                    public void accept(Book book1) {
                        StreamUtils.getBookTitle(book1);
                    }
                });
        StringBuilder stringBuilder = new StringBuilder();
        authors.stream()
                .map(new Function<Author, String>() {
                    @Override
                    public String apply(Author author) {
                        return author.getName();
                    }
                })
                .forEach(str -> stringBuilder.append(str));
        System.out.println(stringBuilder.toString());

    }
}
