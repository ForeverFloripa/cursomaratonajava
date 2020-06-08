/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.datetimepac.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.temporal.TemporalAdjusters;
import javacore.datetimepac.util.ObterProximoDiaUtil;

/**
 *
 * @author User
 */
public class DateTimeAPITest4 {
    public static void main(String[] args) {
        LocalDate date = now();
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        
        date = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        
        
        date = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        
        date = date.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        
        date = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        
        date = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        
        date = date.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        
        
        date = date.plusDays(1);
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        
        date = date.with(new ObterProximoDiaUtil());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
    }
}
