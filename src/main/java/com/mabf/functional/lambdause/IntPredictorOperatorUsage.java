package com.mabf.functional.lambdause;


import java.util.function.Predicate;

public class IntPredictorOperatorUsage {


    @SuppressWarnings("unchecked")
    public static boolean calculate(Predicate predicate, Integer a, Integer b) {
        return predicate.test(a);
    }

    public static void main(String[] args) {
        boolean calculate = calculate(o -> false, 1, 2);
        System.out.println(calculate);//false,
    }

}
