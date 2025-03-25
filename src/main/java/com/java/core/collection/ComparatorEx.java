package com.java.core.collection;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer sb1, StringBuffer sb2) {
        int length1=sb1.length();
        int length2=sb2.length();
      /*  int val=0;
        if(length1<length2){
            val=-100;
        }else if(length1>length2){
            val=100;
        }
        else{
            val=0;
        }
        return val;*/
        return sb1.length()-sb2.length();//for ascending order
        //return -(sb1.length()-sb2.length());//for descending order
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

public class ComparatorEx {
    public static void main(String[] args) {
        StringBuffer sf1=new StringBuffer("aaa");
        StringBuffer sf2= new StringBuffer("b");
        StringBuffer sf3= new StringBuffer("ccc");
        StringBuffer sf4= new StringBuffer("dd");
        StringBuffer sf5= new StringBuffer("e");
        MyComparator comparator=new MyComparator();
        TreeSet ts= new TreeSet(comparator);
        ts.add(sf1);
        ts.add(sf2);
        ts.add(sf3);
        ts.add(sf4);
        ts.add(sf5);
        System.out.println(ts);



    }
}
