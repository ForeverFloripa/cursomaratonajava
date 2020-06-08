/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.optionalpac.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javacore.optionalpac.classes.Pessoa;
import javacore.optionalpac.classes.Carro;
import javacore.optionalpac.classes.Seguradora;

/**
 *
 * @author User
 */
public class OptionalTest2 {
    
    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("DevDojoSeguros");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa p = new Pessoa(carro, "Carlos");
        System.out.println(obterNomeSerguradora(Optional.ofNullable(p)));
        System.out.println("___________ss__________");
        checarNomeSeguradora(seguradora);
        checarNomeSeguradoraOptional(seguradora);
        p.setIdade(20);
        System.out.println(obterNomeSeguradoraComIdade(p, 18));
        Map<String,String> map = new HashMap<>();
        System.out.println(map.get("kaka"));
        System.out.println(Optional.ofNullable(map.get("kaka"))); // encapsulou
        stringToInt("A");
        
    }
    
    
    /***    
     * retorna um Optional.empty caso o parse nao funcione
     * @param numero
     * @return 
     */
    private static Optional<Integer> stringToInt(String numero){
        try{
       return Optional.of(Integer.parseInt(numero));     
        }catch(NumberFormatException e){
            return Optional.empty();
        }
        
    }
    
    
    private static String obterNomeSeguradoraComIdade(Pessoa p, int idadeMinima) {
        return Optional.ofNullable(p)
                .filter(pessoa -> pessoa.getIdade() >= idadeMinima)
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora).map(Seguradora::getNome).orElse("Nao existe Seguradora ou a idade minima nao foi atingida");
        
    }
    
    
    private static void checarNomeSeguradora(Seguradora seguradora) {
        if (seguradora != null && seguradora.getNome().equals("DevDojoSeguros")) {
            System.out.println("é a DevDojoSeguros");
        }
        
    }
    
    private static void checarNomeSeguradoraOptional(Seguradora seguradora) {
        
        Optional.ofNullable(seguradora).filter(s -> s.getNome().equals("DevDojoSeguros"))
                .ifPresent(x -> System.out.println("é o DevDojoSeguros"));
    }
    
    public static String obterNomeSerguradora(Optional<Pessoa> p) {
        return p.flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora");
    }
    
}
