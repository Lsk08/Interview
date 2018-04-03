package com.yp.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by yuan on 2017/12/25.
 */
public class LocalDateTimeDemo {



    public static void main(String[] args) {
        //format time
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));

        //timestamp
        System.out.println(Instant.now().toEpochMilli());

        //time equal
        LocalDateTime now1=LocalDateTime.now();
        LocalDateTime now2=LocalDateTime.now();
        System.out.println(now1.equals(now2));

        //time different
        LocalDateTime now3=LocalDateTime.now();
        LocalDateTime now4=LocalDateTime.of(2017,12,24,12,0);
        System.out.println(Period.between(now4.toLocalDate(),now3.toLocalDate()).getDays());

        //leap year
        System.out.println(LocalDate.of(2008,12,12).isLeapYear());

        //year compare
        System.out.println(LocalDate.of(2017,12,24).isBefore(LocalDate.now()));
        System.out.println(LocalDate.of(2017,12,24).isBefore(LocalDate.now().minus(2, ChronoUnit.DAYS)));

        //plus hours
        System.out.println(LocalDateTime.now().plusHours(2));

        //now date
        System.out.println(LocalDate.now());

    }
}
