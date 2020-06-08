/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \d - busca todos os digitos
        // \D - busca tudo o que nao for digito
        // \s -  busca espaco em branco \t \n \f \r
        // \S - caractere que nao e branco
        // \w - caracteres de palavras a-z A-Z digitos e _
        // \W - tudo que nao for caracter de palavra
        //[]
        //? zero ou uma
        // * 0 ou mais ocorrencias
        // + uma ou mais
        //[n,m] de n ate m ocorrnecias
        // () agrpar
        // | ou
        // $ fim de linha
        // o(v|c)o ovo oco 
        // maca(rr|c)ao = macarrao macacao
        // . coringa   1.3 = 123 1k3 1#3
        // ^ negacao
        int numHex = 0x100F;
        //String regex = "[a-b]";
        //String texto = "sdasvcb ";
        //String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
        //String texto = "as oX 0x 0X 0x999f 0xf22 0x89gx 0x522df";
        //String regex = "([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+(\\s|$)";
        //String texto = "teste@mail@asd.zz asd@gmail.com ff@asd.com.br andere@@dsds,dd zzz@g.com asd@bb.,as a@a teste@mail.com";
        
        //String regex = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
        //String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        //String texto = "05/10/2021 05/5/2015 05/05/2015 1/1/01 01/01/05";//dd/MM/yyyy
        
        String regex = "proj([^,\\s])+";
        String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java proj2.bkp, proj2.class, proj3.java, diagrama, textos";
        
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("texto: " +texto);
        System.out.println("indice:0123456789");
        System.out.println("expressao: "+ matcher.pattern());
        System.out.println("Posicoes encontradas: ");
        while(matcher.find()){
            System.out.println(matcher.start() + " "+ matcher.group());
        }
        //System.out.println(numHex);
        System.out.println("+++++++");
        System.out.println ("Email valido: "+"teste@mailasd.zz".matches(regex));
                
    }
            
    
}
