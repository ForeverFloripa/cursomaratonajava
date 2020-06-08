/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.datetimepac.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.TemporalQueries.localTime;

/**
 *
 * @author User
 */
public class DateTimeAPITest3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017, Month.MARCH, 25);
        System.out.println(localDate);
        localDate.withYear(2020);
        System.out.println(localDate);//soa threadsafe 
        LocalDate localDate1 = localDate.withYear(2020);
        System.out.println(localDate1);//soa threadsafe 
        
       localDate = localDate.withYear(2020);
        System.out.println(localDate);
        
        localDate = localDate.withMonth(Month.AUGUST.getValue());
        System.out.println(localDate);
        localDate = localDate.withDayOfMonth(20);
        System.out.println(localDate);
        
        localDate = localDate.with(ChronoField.DAY_OF_MONTH,15);
        System.out.println(localDate);
        
        localDate = localDate.plusMonths(2);
        System.out.println(localDate);
        
        localDate = localDate.plusDays(10);
        System.out.println(localDate);
        
        localDate =localDate.plus(5,ChronoUnit.MONTHS);// virou o ano
        System.out.println(localDate);
        
        localDate =localDate.plusMonths(2).minusDays(5);
        System.out.println(localDate);
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        time = time.withHour(10);
        System.out.println(time);
        time= time.plusHours(5);
        System.out.println(time);
        
        time = time.plusHours(5).minusMinutes(30);
        System.out.println(time);
        
        
        
       
        
        
    }
    
}
