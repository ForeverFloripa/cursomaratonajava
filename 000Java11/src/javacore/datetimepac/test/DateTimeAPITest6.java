/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.datetimepac.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

/**
 *
 * @author User
 */
public class DateTimeAPITest6 {
    public static void main(String[] args) {
       for(Map.Entry<String,String> zonas :  ZoneId.SHORT_IDS.entrySet()){
           System.out.println(zonas.getKey()+ " "+ zonas.getValue());  
           
       }
        System.out.println("__________________________"
                + "");
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        ZonedDateTime zoneDateTime = dateTime.atZone(tokyoZone);
        System.out.println(zoneDateTime);
        
        
        
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime2 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
        
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset manausOffset = ZoneOffset.of("-04:00");
        LocalDateTime dateTime2 = LocalDateTime.now();
        OffsetDateTime offSetDateTime = OffsetDateTime.of(dateTime2, manausOffset);
        System.out.println(offSetDateTime);
        OffsetDateTime offSetDateTime2 = dateTime2.atOffset(manausOffset);
        System.out.println(offSetDateTime2);
        Instant instant2 = Instant.now();
        System.out.println(instant2.atOffset(manausOffset));
        
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate antigamente = LocalDate.of(1900,2,1);
        System.out.println(japaneseDate.from(antigamente));
        
        
        
        
    }
    
}
