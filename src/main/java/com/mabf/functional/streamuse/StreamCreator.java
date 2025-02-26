package com.mabf.functional.streamuse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamCreator {
    public static void main(String[] args) {
//        createStreamSingleCol();
        createStreamDoubleCol();
    }

    private static void createStreamDoubleCol() {

        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("1", "1");
        objectObjectHashMap.put("2", "2");
        objectObjectHashMap.put("3", "3");
        Set<Map.Entry<String, Object>> entries = objectObjectHashMap.entrySet();
        entries.stream()
                .map(new Function<Map.Entry<String, Object>, String>() {
                    @Override
                    public String apply(Map.Entry<String, Object> objectObjectEntry) {
                        return objectObjectEntry.getKey();
                    }
                }).filter(new Predicate<String>() {
                    @Override
                    public boolean test(String o) {
                        return Integer.valueOf(o) > 1;
                    }
                }).forEach(new Consumer<Object>() {
                    @Override
                    public void accept(Object o) {
                        System.out.println(o);
                    }
                });
    }


    /**
     * 创建单列流
     */
    public static void createStreamSingleCol() {
        String[] arr = new String[]{"a", "b", "c", "d", "e"};
        Stream.of(arr).forEach(System.out::println);
    }
}
