package com.java.core.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40,50);
        int secondHighest= numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()->new RuntimeException("No second element"));
        System.out.println(secondHighest);

    }

}
