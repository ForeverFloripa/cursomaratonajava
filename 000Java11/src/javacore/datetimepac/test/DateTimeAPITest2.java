/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.datetimepac.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author User
 */
public class DateTimeAPITest2 {

    public static void main(String[] args) {
        //new Date().getTime();  // milisegundos
        Instant instant = Instant.now(); // nanosegundos1 jan 1970
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano()); // nunc amaior que 999.999.999
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(2, 1000000000));
        System.out.println(Instant.ofEpochSecond(2, -1000000000));

        System.out.println("__________DURATION___________");

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2017, 1, 1, 23, 0, 0);
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(5, 0, 0);
        //Nao pode utilizar LocalDate
        //Nao pode misturara LocalDateTime com localtime
        Duration d1 = Duration.between(dt1, dt2);
        Duration d2 = Duration.between(time1, time2);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d6 = Duration.between(dt2, time2.atDate(dt2.toLocalDate()));
        Duration d7 = Duration.ofMinutes(3);
        Duration d8 = Duration.of(3, ChronoUnit.DAYS);// cuidar por nao saber a qual da suporte  month ja lanca ex
        Duration d9 = Duration.ofDays(10);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);
        System.out.println(d9);

        System.out.println("_____Period____");

        Period p1 = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(p3.getDays())).getMonths());
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(p3.getDays())));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
        
        System.out.println("____________ChronoUnit_______");
        
        LocalDateTime aniversario = LocalDateTime.of(1978,6,6,0,1,0);
        System.out.println(now);
        System.out.println("Dias: " + ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("Semanas: " + ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("Meses: " +ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println("Anos: " +ChronoUnit.YEARS.between(aniversario, now));
        
        

    }
}
