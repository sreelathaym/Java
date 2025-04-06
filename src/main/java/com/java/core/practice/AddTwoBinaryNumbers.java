package com.java.core.practice;

public class AddTwoBinaryNumbers {
    public static void main(String[] args) {
            String x="101111", y="1110111";
        System.out.println(addTwoBinaryNum(x,y));

    }
    public static String addTwoBinaryNum(String x,String y){
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int sum=num1+num2;
        String result=Integer.toBinaryString(sum);
        return result;
    }

}
