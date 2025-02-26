package com.mabf.functional.streamuse;

import java.util.ArrayList;
import java.util.List;

public class streamsub {
    interface UserString {
        String use(String s, int start, int length);
    }
    public static String substring(String s, int start, int length, UserString userString)
    {
        return userString.use(s, start, length);
    }
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        String test = substring("测试", 0, 2, String::substring);
        System.out.println(test);
    }
}
