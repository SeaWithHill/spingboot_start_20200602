package com.mabf;

/**
 * @author mabf
 * @create 2020-06-04 22:26
 */
public class AB implements A,B {

    @Override
    public String m2() {
        String a =A.super.m2();
        String b = B.super.m2();
        System.out.print("a+"+a+"b"+b);
        return null;
    }

    public static void main(String[] args) {
        AB ab = new AB();
        ab.m2();
    }
}
