package com.java.core.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AlterntiveElements {
     static ArrayList<Integer> getAlternativeelement(int[] arr){
         ArrayList<Integer> res = new ArrayList<>();
         for(int i=0;i<arr.length;i+=2){
             res.add(arr[i]);
         }
      return res;
     }
    public static void main(String[] args) {
         int[] arr={10,20,30,40,50,60};
         ArrayList<Integer>res=getAlternativeelement(arr);
         for(Integer x:res){
             System.out.println(x);
         }
        System.out.println("After alternate variables:"+res);
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        System.out.println("Alternate elements using Streams:");
        IntStream.range(0, list.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(list::get)
                .forEach(System.out::println);

    }
    }

