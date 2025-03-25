package com.java.core.string;

public class ReverseEachWordOfAString {
    public static void main(String[] args) {
        String input = "java code";
        System.out.println("Original String::" + input);

        String output = "";
        //approach-1
        String[] words = input.split(" ");


        for (String word : words) {
            String reversedWord = "";
            //reverse word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }
            output = output + reversedWord + " ";
        }

        System.out.println("Output::"+output);
    }
}
