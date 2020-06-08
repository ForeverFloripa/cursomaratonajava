/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.enumeracao.classes;

/**
 *
 * @author User
 */
public enum TipoCliente {
    //constant specific class body
    PESSOA_JURIDICA(1,"Pessoa Juridica"), PESSOA_FISICA(2,"Pessoa Fisica"){
        public String getId(){
            return "B";
        }
        
    };
    
    
    private int tipo;
    private String nome;

    TipoCliente(int tipo,String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }
    

    
    public String getId(){
    return "A";
}
    
    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
    
    
}
