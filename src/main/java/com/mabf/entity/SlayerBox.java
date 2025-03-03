package com.mabf.entity;

import java.util.ArrayList;

public class SlayerBox<T> extends Box<T> {

    @Override
    public void show(T t) {
        super.show(t);
    }

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.toArray();

    }

    public static <K,V,T> K testNew(K t) {
        System.out.println("saf");
        return t;
    }

}
