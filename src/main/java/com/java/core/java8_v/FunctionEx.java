package com.java.core.java8_v;

//predicate -->conditional check--only return boolean value
//supplier -->will not take any input--->returns output
//Consumer->only input -->No return
//Function->it will take input ---return output


import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
       Function<String,Integer> f=(name)->name.length();
       Integer length=f.apply("sreelatha");
        System.out.println(length);

    }
}
