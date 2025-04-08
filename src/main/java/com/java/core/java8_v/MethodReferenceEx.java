package com.java.core.java8_v;
interface MethodRef {
    void m1();

    public class MethodReferenceEx {


        public static void main(String[] args) {
            // MethodReferenceEx m= new MethodReferenceEx();
            MethodRef mi = MethodReferenceEx::m2;
            mi.m1();

        }

        public static void m2() {
            System.out.println("m2-method");
        }
    }
}

