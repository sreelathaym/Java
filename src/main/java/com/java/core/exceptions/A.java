package com.java.core.exceptions;

public class A {
}
class B extends A{

}
class main{
    public static void main(String[] args) {
        B b = new B();
        A a =b;//up casting is possible
        A a1 = new A();
       // B b1 = a;   --->we cant do that class cast exception
        B b1=(B)a1;  //Explicit type casting
    }
}
