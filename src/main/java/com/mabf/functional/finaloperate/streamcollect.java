package com.mabf.functional.finaloperate;

import com.mabf.entity.Author;
import com.mabf.entity.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamcollect {
    public static void main(String[] args) {
        // 创建五个Author对象，其中两个对象的年龄相同
        Author author1 = new Author("Alice", 30);
        Author author2 = new Author("Bob", 25);
        Author author3 = new Author("Charlie", 35);
        Author author4 = new Author("David", 25); // 年龄与Bob相同
        Author author5 = new Author("Eve", 40);
        // 创建Book对象并设置对应的Author
        Book book1 = new Book("Book One", "123");
        Book book2 = new Book("Book Two", "23");
        Book book3 = new Book("Book Three", "1234");
        Book book4 = new Book("Book Four", "5123");
        Book book5 = new Book("Book Five", "12314");
        book1.setCategory("目录1，目录2");
        book2.setCategory("目录2，目录3");
        book3.setCategory("目录3，目录4");
        book4.setCategory("目录1，目录3");
        book5.setCategory("目录2，目录4");
        book1.setScore(2);
        book2.setScore(3);
        book3.setScore(1);
        book4.setScore(4);
        book5.setScore(5);

        author1.setBooks(Arrays.asList(book1, book2, book3));
        author2.setBooks(Arrays.asList(book4, book5));
        // 将Author对象放入列表中
        List<Author> authors = Arrays.asList(author1, author2);
        List<Object> collect = authors.stream()
                .map((Function<Author, Object>) author -> author.getName())
                .collect(Collectors.toList());
        System.out.println(collect);
        Set<Book> collect1 = authors.stream()
                .flatMap((Function<Author, Stream<Book>>) author -> {
                    if (author.getBooks() != null) {
                        return author.getBooks().stream();
                    }
                    return Stream.empty();
                })
                .collect(Collectors.toSet());
        System.out.println(collect1);
        Map<Object, Object> mapCollection = authors.stream()
                .collect(Collectors.toMap(author -> author.getName(), author -> author.getBooks()));
        System.out.println(mapCollection);


    }
}
