package com.mabf.functional.lambdause;

import java.util.function.IntConsumer;
public class IntCosumerUsage {

    public static String calculate(IntConsumer intConsumer, int a) {
        intConsumer.accept(a);
        return "ok";
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"1", "2", "3"};
        for (String string : strings) {
            calculate(new IntConsumer() {
                @Override
                public void accept(int value) {
                    System.out.println(value);
                }
            }, Integer.parseInt(string));
        }

    }
}
