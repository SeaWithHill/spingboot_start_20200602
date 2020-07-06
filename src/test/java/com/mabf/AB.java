package com.mabf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
//        ab.m2();
        BigDecimal bigDecimal = new BigDecimal(1.01);
        BigDecimal bigDecimal2 = new BigDecimal(2.01);
        BigDecimal bigDecimal11 = new BigDecimal("1.01");
        BigDecimal bigDecimal12 = new BigDecimal("2.02");
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.add(bigDecimal2));
        String ame = "ame";
        String ame1 = "ame";

        System.out.println(bigDecimal11.add(bigDecimal12));
    }

    public  void sT(){
        User user = new User();
        String user1 = user.getUser();
        List<String> list = new ArrayList<String>();
        for (String s : list) {

        }
    }
    class User {
        private String user;
        protected String getUser(){
            return user;
        }
    }


}
