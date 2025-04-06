package com.java.core;

import com.java.core.exceptions.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenAndOddStoredInDifferentList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10, 20, 1, 2, 3, 4, 18, 19, 5, 6, 7, 8, 9, 11);
        List<Integer> evenNum=new ArrayList<>();
        List<Integer> oddNum=new ArrayList<>();

        Collections.sort(list);
        System.out.println("After Sorting list: " +list);

        for(Integer num: list){
            if(num%2==0){
                evenNum.add(num);
            }
            else{
                oddNum.add(num);
            }
        }
        System.out.println("Even numbers : "+evenNum);
        System.out.println("odd numbers : "+oddNum);

    }


}
