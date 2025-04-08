package com.java.core.java8_v;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEXa {
    public static void main(String[] args) {
//        Stream s= Stream.of(10,11,12,23,34,45);
//
//        Stream<Integer> filter=s.filter(i -> i>20);
        List<Integer> l=Arrays.asList(10,11,12,23,34,45);
//        for(Integer list :l){
//            if(list>20){
//                System.out.println(list);
//            }
//        }
        Stream<Integer> s1=l.stream();
        Stream<Integer> filter=s1.filter(i->i>20);
        filter.forEach(i-> System.out.println(i));
        System.out.println("========================");

        l.stream().filter(i->i>20).forEach(System.out::println);
    }
}
