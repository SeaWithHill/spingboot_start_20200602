package com.mabf.functional.finaloperate;

import com.mabf.entity.Author;

import java.util.Arrays;
import java.util.List;

public class streamallmatch {
    public static void main(String[] args) {
        // 创建五个Author对象，其中两个对象的年龄相同
        Author author1 = new Author("Alice", 30);
        Author author2 = new Author("Bob", 25);
        Author author3 = new Author("Charlie", 35);
        Author author4 = new Author("David", 25); // 年龄与Bob相同
        Author author5 = new Author("Eve", 40);

        // 将Author对象放入列表中
        List<Author> authors = Arrays.asList(author1, author2);
        boolean b = authors.stream()
                .allMatch(author -> {
                    if (Integer.valueOf(author.getAge()) > 30) {
                        return true;
                    }
                    return false;
                });
        System.out.println(b);


    }
}
