/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.concorrencia.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *
 * @author User
 */
public class ConcorrenciaDeColecoesTest {

    public static void main(String[] args) {

//        Map<String,String> map = new HashMap<>(); 
//        map.put("1","1");
//        map.put("1","2");
//        System.out.println(map.get("1"));

        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "1");
        map.putIfAbsent("1", "2");
        System.out.println(map.get("1"));
    }

}
