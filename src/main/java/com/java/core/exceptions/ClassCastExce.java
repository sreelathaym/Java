package com.java.core.exceptions;

public class ClassCastExce {
    //before creating respective class .class file
    static{
        System.out.println("Employee class loading");
    }
}
class Test{
    public static void main(String[] args) throws ClassNotFoundException {
        //fully qualified name=====package.classname
        Class.forName("com.java.core.exceptions.ClassCastExce");//fully qualified name
        Class.forName("com.java.core.exceptions.ClassCast");
    }
}
