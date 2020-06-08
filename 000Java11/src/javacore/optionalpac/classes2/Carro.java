/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.optionalpac.classes2;
 



/**
 *
 * @author User
 */
public class Carro {
    private Seguradora seguradora;
    private String nome;
    
    
    public String getNomeSeguradora(Pessoa p){
        if(p!= null){
            Carro carro = p.getCarro();
            if(carro != null){
                Seguradora s = carro.getSeguradora();
                if(s!=null){
                    return s.getNome();
                }
                
            }
        }
        return "";
        
    }

    public Seguradora getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
