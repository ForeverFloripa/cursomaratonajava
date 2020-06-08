/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author User
 */
public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println("___________");
        Calendar c= Calendar.getInstance();
        c.setTime(date);
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
        System.out.println("Domingo e o primeiro dia da semana");
    }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.getTime());
        c.add(Calendar.HOUR,-1);  
        c.add(Calendar.HOUR,1);  
        
        System.out.println(c.getTime());
        c.roll(Calendar.MONTH,11);
        System.out.println(c.getTime());
    }
    
}


//NumberFormat, Locale, Calendar, Date, DateFormat  sao as 5 classes para local e data moeda 
