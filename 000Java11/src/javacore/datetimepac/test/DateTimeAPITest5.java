/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.datetimepac.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author User
 */
public class DateTimeAPITest5 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = "20170221";// nao aceita
        String s5 = "2020-02-21";

        //LocalDate.parse(s4);//nao aceita
        LocalDate parse = LocalDate.parse(s4, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("parse: " + parse);

        LocalDate parse2 = LocalDate.parse(s5, DateTimeFormatter.ISO_DATE);
        System.out.println("parse2: " + parse2);

        LocalDateTime dateTime = LocalDateTime.now();
        String s6 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("s6: " + s6);

        LocalDateTime parse3 = LocalDateTime.parse("2020-04-18T14:53:09.681");
        System.out.println("parse3:  " + parse3);

        //dd/MM/yyyy br
        //MM/dd/yyyy eua
        //YYYY/MM/dd jp
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        String dataBRString = "18/04/2020";
        LocalDate parse4 = LocalDate.parse(dataBRString, formatterBR);
        System.out.println("parse4:  " + parse4);

        DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
        String formatFR = LocalDate.now().format(formatterFR);
        System.out.println(formatFR);
        
        LocalDate parse5 = LocalDate.parse("18.avril.2020",formatterFR);
        System.out.println(parse5);

    }

}
