package com.java.core.java8_v;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(50);
        al.add(34);
        System.out.println("Before sort" + al);
        al.forEach(i -> System.out.println(i));
    }
}
