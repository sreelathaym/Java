package com.java.core.java8_v;

import java.util.Arrays;
import java.util.List;

public class MapEx {
    public static void main(String[] args) {
        List<String> al= Arrays.asList("Arvi","Xen","Ben","Den");
//        for(String s:al){
//            System.out.println(s.toLowerCase());
//        }
        //al.stream().map(name->name.toLowerCase()).forEach(System.out::println);
        al.stream().mapToInt(names->names.length()).forEach(i-> System.out.println(i));
        List<String> al1= Arrays.asList("Arvi","Xen","Ben","Den","achi","alokh");
        al1.stream().filter(i->i.startsWith("a")  )
                .map(n->n + "_"+n.length())
                .forEach(p-> System.out.println(p));
    }
}
