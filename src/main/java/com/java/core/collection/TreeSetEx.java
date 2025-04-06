package com.java.core.collection;

import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) {
        //following insertion order
        List<String> l= new ArrayList<>();
        l.add("AAA");
        l.add("DDD");
        l.add("BBB");
        l.add("CCC");
        System.out.println(l);

        //its not following order
        Set<String> hs= new HashSet<>(l);
        System.out.println(hs);

        //following sorting order
        TreeSet<String> t= new TreeSet<>(l);
        System.out.println(t);
        t.add("BBB");
        //tree set allowed only homognious data
        //duplicates are not allowed
        //t.add(new Integer(10)));




    }
}
