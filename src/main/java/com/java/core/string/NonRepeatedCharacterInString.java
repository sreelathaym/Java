package com.java.core.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;


public class NonRepeatedCharacterInString {
    public static void main(String[] args) {
        String input="AABCDEE";
        for(int i=0;i<input.length();i++){
            boolean unique=true;
            for(int j=0;j<input.length();j++){
                if(i!=j && input.charAt(i)==input.charAt(j)){
                    unique=false;
                    break;//Inner for loop will break because of repeating char
                }
            }
            if(unique){
                System.out.println(input.charAt(i));
                //break;   //-->if we use break first nonrepeated character
            }
        }
        //Approach-2
        Map<Character,Integer> hsm=new HashMap<>();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(hsm.containsKey(ch)){
                hsm.put(ch,hsm.get(ch)+1);
                }else {
                hsm.put(ch,1);//first occurence
            }
            }
        System.out.println(hsm);
        for(Entry<Character, Integer> entryset1 : hsm.entrySet()) {
            if(entryset1.getValue()==1){
                System.out.println(entryset1.getKey());
                break;
            }
        }
        }
    }

