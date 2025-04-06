package com.java.core.java8_v;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c=(name)-> System.out.println(name+"  Good morning");
        c.accept("Sreelatha");
        c.accept("latha");
        List<Integer> numbers= Arrays.asList(10,20,30,40);
        //consumer it will take input but it will not give anything
        //foreach method will take consumer as parameter
        numbers.forEach(i-> System.out.println(i));

        BiConsumer<String,String> bi=(name,greeting)-> System.out.println(name+" "+greeting);
        bi.accept("sree","good morning");
    }

}
