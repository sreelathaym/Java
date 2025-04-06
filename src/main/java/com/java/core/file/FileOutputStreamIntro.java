package com.java.core.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamIntro {
    public static void main(String[] args) throws IOException {
        //if it is true second argument data will append to the existing file
        //if it is false-will not append,it will overwrite
        //but here file not found Exception not possible because jvm will check before creating
        //if not will create new file
        //declare the data
        //byte oriented stream

        //FileOutputStream fos= new FileOutputStream("abc.txt",true);//---->append operation
        FileOutputStream fos= new FileOutputStream("abc.txt");//default operation just create and write data
       // FileOutputStream fos1= new FileOutputStream("abc.txt",false);//-->overwrite operation


        //String so it  converted into byte array then it will read
        String data ="Writing Data into abc.txt File";
        byte[] bytes=data.getBytes();
        fos.write(bytes);
        System.out.println("Data transfered from java application to the target file");
        fos.close();

    }
}
