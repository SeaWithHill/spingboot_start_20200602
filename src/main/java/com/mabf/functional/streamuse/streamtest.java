package com.mabf.functional.streamuse;

import com.mabf.entity.Author;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamtest {
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
                .collect(Collectors.toSet());
        Map<String, Integer> collect = authors.stream()
                .collect(Collectors.toMap(new Function<Author, String>() {
                    @Override
                    public String apply(Author author) {
                        return author.getName();
                    }
                }, new Function<Author, Integer>() {
                    @Override
                    public Integer apply(Author author) {
                        return author.getAge();
                    }
                }));
        System.out.println(collect);
        Optional<Integer> reduce = authors.stream()
                .parallel()
                .peek(new Consumer<Author>() {
                    @Override
                    public void accept(Author author) {
                        System.out.println(Thread.currentThread().getName());
                    }
                })
                .map(new Function<Author, Integer>() {
                    @Override
                    public Integer apply(Author author) {
                        return author.getAge();
                    }
                })
                .reduce(new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer1, Integer integer2) {
                        return integer1 + integer2;
                    }
                });
        reduce.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
       });
    }
}
