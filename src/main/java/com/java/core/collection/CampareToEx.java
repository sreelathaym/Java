package com.java.core.collection;

public class CampareToEx {
    public static void main(String[] args) {
        String str1= new String("abc");
        String str2=new String("def");
        String str3=new String("abc");

        System.out.println(str1.compareTo(str2));//abc.compareTo(def)  -ve
        System.out.println(str2.compareTo(str1));//def.compareTo(abc)   +ve
        System.out.println(str3.compareTo(str1));
        System.out.println(str1.compareTo(str3));
    }
}
