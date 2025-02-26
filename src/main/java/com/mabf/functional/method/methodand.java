//package com.mabf.functional.method;
//
//import com.mabf.entity.Author;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class methodand {
//    public static void main(String[] args) {
//        // 创建五个Author对象，其中两个对象的年龄相同
//        Author author1 = new Author("Alice", 16);
//        Author author2 = new Author("Bob", 25);
//        Author author3 = new Author("Charlie", 35);
//        Author author4 = new Author("David", 25); // 年龄与Bob相同
//        Author author5 = new Author("Eve", 40);
////        // 将Author对象放入列表中
//        List<Author> authors = Arrays.asList(author1, author2, author3, author4, author5);
////        authors.stream()
////                .filter(new Predicate<Author>() {
////                    @Override
////                    public boolean test(Author author) {
////                        return author.getAge() > 17;
////                    }
////                }.and(new Predicate<Author>() {
////                    @Override
////                    public boolean test(Author author) {
////                        return author.getName().length() > 4;
////                    }
////                })).forEach(System.out::println);
////        authors.stream()
////                .filter(new Predicate<Author>() {
////                    @Override
////                    public boolean test(Author author) {
////                        return author.getAge() > 17;
////                    }
////                }.or(new Predicate<Author>() {
////                    @Override
////                    public boolean test(Author author) {
////                        return author.getName().length() > 4;
////                    }
////                })).forEach(System.out::println);
////       通过测试来显示
//        authors.stream().map(author -> author.getAge())
//                .map(String::valueOf)
//                .forEach(s -> System.out.println(s));
////
//
//
//        authors.stream().map(author -> author.getAge()).map(o -> String.valueOf(o + 100)).forEach(s -> System.out.println(s));
//    }
//
//
//}
