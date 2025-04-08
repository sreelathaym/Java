package com.java.core.java8_v;

import java.util.function.Supplier;

public class ConstructorRef {
    public static void main(String[] args) {
        Supplier<Doctor> d = Doctor::new;
        //Doctor doctor=d.get();
        System.out.println(d.get().hashCode());
    }
}
class Doctor{
    //need zero arg constructor

    public Doctor(int i){
        System.out.println("Doctor class Constructor");
    }

    public Doctor() {
    }
}
