package com.java.core.java8_v;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapEx {
    public static void main(String[] args) {
        List<String> javaCourses= Arrays.asList("core java","Adv Java","Sping","SpringBoot");
        List<String> uiCourses=Arrays.asList("html","css","bs");
        List<String>  dbCourses=Arrays.asList("SQL","mysql");
        List<List<String>> courses=Arrays.asList(javaCourses,uiCourses,dbCourses);
//display in list
      //  courses.stream().forEach(c-> System.out.println(c));

        //display one by one
       Stream<String> flatmap= courses.stream().flatMap(s->s.stream());
       flatmap.forEach(cou-> System.out.println(cou));


    }
}
