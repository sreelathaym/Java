package com.java.core.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) throws IOException {
        //this file should be exist and provide correct path
        FileInputStream fis=new FileInputStream("src/main/resources/welcome.txt");
        int size=fis.available(); //getting size of this file

        byte[] bytes= new byte[size];//passing byte size
        fis.read(bytes);//reading fine in bytes

        String data= new String(bytes);//converting data into string
        System.out.println("getting data bytes  into text format::    "+"\n"+data);

        fis.close();

    }
}
