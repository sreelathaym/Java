package com.java.core.java8_v;

import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        StringJoiner sj= new StringJoiner("-");
        sj.add("sree");
        sj.add("latha");
        sj.add("goog morning");
        System.out.println(sj);

        StringJoiner sj1= new StringJoiner("-","(", ")");
        sj1.add("sree");
        sj1.add("Latha");
        sj1.add("goog morning");
        System.out.println(sj1);


    }
}
