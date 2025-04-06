package com.java.core.collection;
import  java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
      Stack<String> s= new Stack<String>();
        s.push("AAA");
        s.add("BBB");
        s.push("ccccc");
        System.out.println(s);
        Stack<String> s1=new Stack<>();
        System.out.println(s1.capacity());

        //Stack will follow LIFO
        System.out.println(s.pop());//first element is last element in stack frame
        System.out.println(s);
        System.out.println(s.peek());//just identify element
        System.out.println(s);
        System.out.println(s.search("BBB"));//returns Index
        System.out.println(s);
        System.out.println(s.search("DDD"));//return -1 there is no DDD element



    }
}
