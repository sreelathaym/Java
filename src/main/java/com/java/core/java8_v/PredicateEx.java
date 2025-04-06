package com.java.core.java8_v;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> p=i->i<5 ;
        System.out.println(p.test(10));

        //more than 1 input
       BiPredicate<Integer,Integer> bi=(i,j)->(i+j) >=20;
        System.out.println(bi.test(10,20));
    }
}
