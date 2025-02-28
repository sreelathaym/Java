package com.java.core.collection;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class ListInterface {
    public static void main(String[] args) {
        List<String> al= new ArrayList<>();
        al.add("Sree");
        al.add("latha");
        al.add("hari");
        al.add("honey");
        al.add(4,"DDDDD");
        al.add(5,null);
        try {
            al.add(7, "EEEE");
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Before iteration of objects::"+al);
        for(String alist:al){
            System.out.println(alist);
        }
        al.removeFirst();
        System.out.println("After removing first element:"+al);

        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.contains("Sree"));

        //using one list passing into another
        List<String> al1=new LinkedList<>(al);
        System.out.println(al1);

        //using iterator
        Iterator it = al1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(al1);
        for(int i=0;i<al1.size();i++){
            System.out.println(al1.get(i));
        }
        System.out.println(al.lastIndexOf("latha"));
        Set<String>hs=new HashSet<>();
        hs.add("AAAA");
        hs.add("BBBB");
        List<String>al3=new ArrayList<>(hs);
        System.out.println("Converting Hashset in to ArrayList::"+hs);
        Queue<String> q=new ArrayDeque<>(al3);
        System.out.println("Array queue::"+q);
        List l= new ArrayList();
        l.add(10);
        l.add("AAA");
        l.add(new StringBuffer("10"));
        System.out.println("Different Objects Added to arraylist"+l);

    }

}
