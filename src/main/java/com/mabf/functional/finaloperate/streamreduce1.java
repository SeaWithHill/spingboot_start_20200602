package com.mabf.functional.finaloperate;

import com.mabf.entity.Author;

import java.util.Arrays;
import java.util.List;

public class streamreduce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println(sum);
        test02();
    }

    private static void test02() {
        // 创建五个Author对象，其中两个对象的年龄相同
        Author author1 = new Author("Alice", 30);
        Author author2 = new Author("Bob", 25);
        Author author3 = new Author("Charlie", 35);
        Author author4 = new Author("David", 25); // 年龄与Bob相同
        Author author5 = new Author("Eve", 40);
        // 将Author对象放入列表中
        List<Author> authors = Arrays.asList(author1, author2);
        Integer identity = 0;
        Integer reduce = authors.stream()
                .map(author -> author.getAge())
                .reduce(identity, (o, o2) -> o + o2);
        System.out.println(reduce);
    }
}
