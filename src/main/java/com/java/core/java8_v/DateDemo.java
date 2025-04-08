package com.java.core.java8_v;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
//MM--month in digit    MMM-sort form of month name

        //Convert Date to String ---used format()
        SimpleDateFormat sd= new SimpleDateFormat("dd/MMMM/yy");
        String format=sd.format(d);
        System.out.println(format);

        SimpleDateFormat sd1= new SimpleDateFormat("dd/MM/yy");
        String format1=sd1.format(d);
        System.out.println(format1);

        SimpleDateFormat sd2= new SimpleDateFormat("MMM/dd/yyyy");
        String format2=sd2.format(d);
        System.out.println(format2);


        //Convert String to date --parse()
        SimpleDateFormat sd3= new SimpleDateFormat("yyyy-mm-dd");
        Date parsedDate=sd3.parse("2022-12-06");
        System.out.println(parsedDate);


        //Date creating using sql
        java.sql.Date d1 = new  java.sql.Date(20221222);
        System.out.println(d1);


    }
}
