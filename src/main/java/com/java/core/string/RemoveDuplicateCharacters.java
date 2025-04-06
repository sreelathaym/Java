package com.java.core.string;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static <set> void main(String[] args) {
        //Approach-1
        String str="Programming";
        StringBuilder sb=new StringBuilder();

        str.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);

        //Approach-2
        StringBuilder sb1= new StringBuilder();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            int index = str.indexOf(ch, i + 1);
            if (index == -1) {
                sb1.append(ch);
            }
        }
        System.out.println(sb1);

        //Approach3
        char[] ch= str.toCharArray();
        StringBuilder sb2= new StringBuilder();
        for(int i=0; i < ch.length; i++) {
            boolean repated = false;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    repated = true;
                    break; //once it is repeated no need to repeat other
                }
            }
            if (!repated) {
                sb2.append(ch[i]);
            }
        }

            System.out.println(sb2);

        //approach-4
        StringBuilder sb3= new StringBuilder();
        Set<Character> set= new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character c:set)     {
        sb3.append(c);
        }
        System.out.println(sb3);

        //approach5
        StringBuilder sb4= new StringBuilder();
        Set<Character> set1 = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set1.add(str.charAt(i));
        }
        for(Character c:set1){
            sb.append(sb4);
        }
        System.out.println(sb4);
    }

}


