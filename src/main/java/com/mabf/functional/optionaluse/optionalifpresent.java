package com.mabf.functional.finaloperate;

import com.mabf.entity.Author;

import java.util.Optional;
import java.util.function.Consumer;

public class streamoptional {
    public static void main(String[] args) {
        Author author = new Author("Steve", 11);
        Optional<Author> authorOptional = Optional.ofNullable(author);
        authorOptional.ifPresent(author1 -> System.out.println(author1.getName()));
        getAuthor().ifPresent(new Consumer<Author>() {
            @Override
            public void accept(Author author) {
                System.out.println(author.getName());
            }
        });
        Author newAuther = null;
        Optional<Author> newAuther1 = Optional.of(newAuther);
        newAuther1.ifPresent(author1 -> System.out.println(author1.getName()));
    }

    private static Optional<Author> getAuthor() {
        Author author = new Author("Steve", 11);
        return
                Optional.ofNullable(author);
    }

    private static void test04() {
        // 创建五个Author对象，其中两个对象的年龄相同
        Author author1 = new Author("Alice", 30);
        Author author2 = new Author("Bob", 25);
        Author author3 = new Author("Charlie", 35);
        Author author4 = new Author("David", 25); // 年龄与Bob相同
        Author author5 = new Author("Eve", 40);
        // 将Author对象放入列表中
        Optional.of(author5)
                .ifPresent(author -> System.out.println(author.getName()));

    }
}

