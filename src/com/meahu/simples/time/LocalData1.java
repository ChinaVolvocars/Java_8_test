package com.meahu.simples.time;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


/**
 * Created by idea on 2016/8/31.
 */
public class LocalData1 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);

        System.out.println(today);
        System.out.println(tomorrow);
        System.out.println(yesterday);

        LocalDate independenceDay = LocalDate.of(2016, Month.AUGUST, 31);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        System.out.println(independenceDay.getMonth());
        System.out.println(dayOfWeek);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
        LocalDate date = LocalDate.parse("31.08.2016", dateTimeFormatter);
        System.out.println(date);//2016-08-31

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.CHINA);
        LocalDate parse = LocalDate.parse("2016-08-31", dateTimeFormatter1);
        System.out.println("China >>>>>> " + parse);


    }

}
