package com.java.core.exceptions;
class Employee1{
    static{
        System.out.println("Employee class loading...");
    }
//If we remove 0-arg constructor we will get InstantiationException exception even arugument constructor providing alsp
    Employee1(){
        System.out.println("Employee object is creating");
    }
    Employee1(int i){
        System.out.println("Employee object is creating");
    }
}
public class InstantiationEx {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("com.java.core.exceptions.Employee1");
        Object obj= c.newInstance();
    }
}
