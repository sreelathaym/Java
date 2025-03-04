package com.java.core.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        List<String> l= new ArrayList<>();
        l.add("sree");
        l.add("latha");
        l.add("sai");
        ListIterator lt=l.listIterator();
        while(lt.hasNext()){
            System.out.println(lt.nextIndex()+"-----"+lt.next());
        }
        System.out.println(l);
        System.out.println("Elements in backward direction:");
        while (lt.hasPrevious()) {

            System.out.println(lt.previousIndex()+"----"+lt.previous());
        }
        System.out.println(l);
    }
}
