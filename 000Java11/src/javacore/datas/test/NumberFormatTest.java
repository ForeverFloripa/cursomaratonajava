/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.datas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class NumberFormatTest {

    public static void main(String[] args) {
        float valor = 212.4567f;
        Locale locJP = new Locale("jp");
        Locale locIT = new Locale("it");
        Locale locEN = new Locale("en");
        NumberFormat[] nfa = new NumberFormat[6];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locJP);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locJP);
        nfa[4] = NumberFormat.getCurrencyInstance(locEN);
        nfa[5] = NumberFormat.getCurrencyInstance(locIT);

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }

        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        //nf.setMaximumFractionDigits(1);
        System.out.println(nf.format(valor));
        System.out.println("****************");

        String valorString = "121212,33";
        try {
            System.out.println(nf.parse(valorString));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
