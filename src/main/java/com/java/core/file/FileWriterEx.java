package com.java.core.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        //is a character oriented Stream--same as FOS
        FileWriter fw=new FileWriter("hello.txt");//-->replace operation
       // FileWriter fw=new FileWriter("hello.txt",true);//-->append mode
       // FileWriter fw=new FileWriter("hello.txt",false);//-->overwrite operation
        String s= "Hello welcome to java Developer community";

       char[] chars= s.toCharArray();
//Ascii value representation inside covert and transfer
        fw.write(chars);
        System.out.println("Data transfered from java application to file");
        fw.close();

    }
}
