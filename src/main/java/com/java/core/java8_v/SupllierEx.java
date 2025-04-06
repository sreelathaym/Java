package com.java.core.java8_v;

import java.util.function.Supplier;

public class SupllierEx {
    public static void main(String[] args) {
       // String symbols="ABCDEFGHIJKLMNOPQRSTUWXYZ";
        //Supplier<String

       Supplier<String > s=()->{
            String opt ="";
            for(int i=1;i<5;i++){
                //here removing decimal doing multiple by 10

                opt=opt+(int)(Math.random()*10);
            }
            return opt;
        };
        System.out.println(s.get());
    }
}
