package com.mabf.functional.finaloperate;


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class streamreduce2 {

    public static void main(String[] args) {
        AuthorStream author1 = new AuthorStream("Alice", 30);
        AuthorStream author2 = new AuthorStream("Bob", 25);
        // 将Author对象放入列表中
        List<AuthorStream> authors = Arrays.asList(author1, author2);
        authors.stream()
                .map(new Function<AuthorStream, Integer>() {
                    @Override
                    public Integer apply(AuthorStream author) {
                        return author.getAge();
                    }
                })
                .reduce(new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer < integer2 ? integer : integer2;
                    }
                });
    }


}

class AuthorStream {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AuthorStream(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
