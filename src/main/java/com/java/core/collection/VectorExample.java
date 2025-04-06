package com.java.core.collection;

import java.util.*;


public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("AAAA");
        v.add("BB");
        System.out.println(v.capacity());
        Vector<Integer>v1= new Vector<>();
        System.out.println(v1.capacity());

        for(int i=0;i<=11;i++){
            v1.add(i);
        }
        System.out.println(v1.capacity());

        for(int i=12;i<=22;i++){
            v1.add(i);
        }
        System.out.println(v1.capacity());

        //vector provided our own incremental value
        Vector<Integer> v2= new Vector<>(v1);
        System.out.println(v2.capacity());

        HashSet<String> hs = new HashSet<>();
        hs.add("xxx");
        hs.add("yyy");
        Vector<String> v3=new Vector<>(hs);
        System.out.println("After adding hs values to V3:::"+v3);

        Queue<String> q= new PriorityQueue<>(v3);
        System.out.println("Queue::"+q);

        //Methods
        System.out.println(v3.indexOf("xxx"));
        System.out.println(v3.lastIndexOf("xxx"));
        System.out.println(v3.firstElement());
        System.out.println(v2.lastElement());
       // System.out.println(v2.elements());
        System.out.println(v2.elementAt(3));
        System.out.println(v2.removeElement(12));//boolean
        v2.removeElementAt(2);
        System.out.println(v2);
        v2.removeElement(13);
        System.out.println(v2);



    }
}
