package com.mabf.functional.lambdause;

import java.util.function.Function;

public class TypeConverter {
    public static String convert(Function<String,Object> function, String str) {
        Object apply = function.apply(str);
        return apply.toString();
    }


    public static void main(String[] args) {
        String convert = convert(s -> Integer.parseInt(s), "123");
        System.out.println(convert);
    }
}
