package com.java.core.exceptions;
class C{
    int i=10;
    public boolean m1(){
        System.out.println("m1-A");
        return false;
    }

}
public class NullPoint {
    public static void main(String[] args) {
        //reference related not static content
        C c = null;
        System.out.println( c.i);
        System.out.println(c.m1());

    }
}
