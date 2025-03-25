package com.java.core.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArralistConvertToArray {
    public static void main(String[] args) {
        List<String> ar= Arrays.asList("10","20","30","40");
        System.out.println("Array list elements: "+ar);

        String[] array=ar.toArray(new String[0]);
        System.out.println("After convering ArrayList to Array: "+Arrays.toString(array));
        for(String s:array){
            System.out.println(s);
        }

        //covet Using StreamApi
        List<Integer> l= new ArrayList<>();
        l.add(10);
        l.add(3);
        l.add(5);
        Integer[] array1 = l.stream().toArray(Integer[]::new);
        System.out.println("After converting array:"+Arrays.toString(array1));
        System.out.println("After iterating array elements:");
        for(Integer i:array1){
            System.out.println(i);
        }

    }
}
