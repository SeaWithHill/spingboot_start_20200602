package com.mabf.functional.lambdause;


import java.util.function.IntBinaryOperator;
public class IntBinaryOperatorUsage {


    public static int calculate(IntBinaryOperator intBinaryOperator, int a, int b) {
        int i = intBinaryOperator.applyAsInt(a, b);
        return i;
    }

    public static void main(String[] args) {
        int calculate = calculate(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return 0;
            }
        },1,2);
        System.out.println(calculate);
    }

}
