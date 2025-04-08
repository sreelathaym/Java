package com.java.core.java8_v;

import java.util.Arrays;
import java.util.List;

public class FilterString {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Honey","Boby","Arun","Achyuth");
        names.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
    }
}
