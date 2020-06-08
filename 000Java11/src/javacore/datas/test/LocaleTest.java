/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author User
 */
public class LocaleTest {
    public static void main(String[] args) {
        //ISO 639 pt=portugues BR = Brasil, en = ingles, US = Estados Unidos
        Locale locBrasil = new Locale("pt","BR");
        Locale locItaly = new Locale("it","IT");
        Locale locSuica = new Locale("it","CH");
        Locale locIndia = new Locale("hi","IN");
        Locale locJapao = new Locale("ja");
        Calendar c = Calendar.getInstance();
        c.set(2999,Calendar.MARCH,01);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,locBrasil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,locItaly);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,locSuica);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,locIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,locJapao);
        
        System.out.println(df1.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));
        System.out.println(df3.format(c.getTime()));
        System.out.println(df4.format(c.getTime()));
        System.out.println(df5.format(c.getTime()));
        
        System.out.println(locIndia.getDisplayLanguage());
        System.out.println("India em Japones: "+locIndia.getDisplayLanguage(locJapao));
        System.out.println(locIndia.getDisplayCountry(locItaly));
        System.out.println(locSuica.getDisplayCountry(locItaly));
    
    }
    
    
}
