package com.java.core.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        //input="hello
        //output-h-1,e-1,l-2,o-1
        String input="Hello";
        Map<Character,Integer> map = new HashMap<>();
        char[] chars= input.toCharArray();
        for(char ch:chars){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int value=map.get(ch);
                map.put(ch,value+1);
            }
        }//end of for loop
        System.out.println(map);
        //if we want insertion order
//        LinkedHashMap<Character,Integer> lsh=new LinkedHashMap<>(map);
//        System.out.println(lsh);

    }
}

