package com.java.core.java8_v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//sorting descending order
public class SortCoolectionUsingLambda {
    public static void main(String[] args) {
        List<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(50);
        al.add(34);
        System.out.println("Before sort"+al);
//Approch-1
       // Collections.sort(al,new NumberComparator());

        //Sort elements using lambda asscending
        Collections.sort(al, (i,j)->i.compareTo(j));
        System.out.println("After Sorting::"+al);

        Collections.sort(al, (i,j)->(i>j)?-1:1

        );
        System.out.println("After descending ::"+al);


    }
}
//Approch-1
/*class NumberComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
         if(o1>o2){
             return -1;
         }else if(o1<o2){
             return 1;

         }else{
             return 0;
         }

    }
}*/
