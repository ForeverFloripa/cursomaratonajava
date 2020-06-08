/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.datas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author User
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "'Florianopolis, 'dd 'de' MMMM ' de 'yyyy 'as' HH:mm:ss z";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        String datinha = formatador.format(c.getTime());
        System.out.println(datinha);
        
    }
    
}
