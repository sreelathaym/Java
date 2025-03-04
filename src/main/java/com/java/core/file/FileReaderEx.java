package com.java.core.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader fr= new FileReader("src/main/resources/readerfile.txt");
        String data="";
        int val=fr.read();
        while(val != -1){
            data = data +(char)val; //value converting into char
            val = fr.read();
        }
        System.out.println(data);
        fr.close();
    }
}
