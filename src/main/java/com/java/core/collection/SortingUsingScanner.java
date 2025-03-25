package com.java.core.collection;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingUsingScanner {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        System.out.println("Enter Numbers to sort");
        for(int i=0;i<=n;i++){
            int numbers=sc.nextInt();
            ar.add(numbers);
        }
        Collections.sort(ar);
        System.out.println("After sorting numbers : "+ar);
    }
}
