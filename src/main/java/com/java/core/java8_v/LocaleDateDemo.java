package com.java.core.java8_v;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class LocaleDateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        LocalDate date= LocalDate.of(2021,1,20);

        System.out.println(date);

        LocalDate d2= LocalDate.now();
        System.out.println(d2);

        d2 = d2.plusDays(3);
        System.out.println(d2);
        d2 = d2.plusMonths(3);
        System.out.println(d2);


        LocalTime lt= LocalTime.now();
        System.out.println(lt);

        System.out.println(lt.getHour());

        boolean leapyear=LocalDate.parse("2022-12-22").isLeapYear();
        System.out.println(leapyear);

        boolean before =LocalDate.parse("2022-12-22").isBefore(LocalDate.parse("2022-12-22"));
        System.out.println(before);

        Period between= Period.between(LocalDate.parse("1989-12-22"),LocalDate.now());
        System.out.println(between);

        Duration duration=Duration.between(LocalTime.parse("18:00"),LocalTime.now());
        System.out.println(duration);


    }
}
