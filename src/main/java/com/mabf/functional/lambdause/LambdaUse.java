package com.mabf.functional;

public class LambdaUse {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("this is a simple test");
        }).start();
    }

    public void test(){
        new Thread(()->{
            System.out.println("this is a simple test");
        }).start();
    }




}
