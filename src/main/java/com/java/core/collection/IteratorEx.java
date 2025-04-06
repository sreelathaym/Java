package com.java.core.collection;

import java.util.*;

public class IteratorEx{
    public static void main(String[] args) {
        List<String> l= new ArrayList<>();
        l.add("sree");
        l.add("latha");
        l.add("sai");
        Iterator it = l.iterator();
        while (it.hasNext()) {
            String element = (String) it.next();
            if (element.equals("sree")) {
                it.remove();
            }
        }
            System.out.println(l);


    }
}
