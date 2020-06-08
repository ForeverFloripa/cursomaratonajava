/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("k_teclado", "teclado");
        map.put("k_vc", "voce");
        map.put("k_mouse", "mouse");
        map.put("k_mouze", "mouse2");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
