package com.java.core.exceptions;

public class StackOverfloeEx {
    public static void main(String[] args) {
recursive();
    }
    public static void recursive(){
        recursive();
    }
}
