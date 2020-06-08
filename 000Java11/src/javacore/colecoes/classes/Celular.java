/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.classes;

import java.util.Comparator;




public class Celular {
    private String nome;
    private String IMEI;

    public String getNome() {
        return nome;
    }
    // metodo equals
    // reflexivo = x.equals(x) tem que ser true para tudo o que for diferente de null
    //simetrico  para x e y diferentes de null, se x.equals (y)== true logo y.equals(x)tem q ser true
    //transitividade para x y z diferentes de null, se x.equals(y)==true 
    //logo y.equals(x)==true e x.equals(z)==true, entao y.equals(z)temque ser true
    //consistente x.equals(y) deve retornar sempre o mesmo valor
    //para x diferente de null x.equals(null) tem que retornar false

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(this==obj)return true;
        if(this.getClass() != obj.getClass()) return false;
        Celular outroCelular= (Celular) obj;
        return IMEI !=null ? IMEI.equals(outroCelular.getIMEI()): false;
    }

    
    // hashcode
    //se x.equals(y) == true y.hashcode() == x.hashcode()
    //y.hashcode() == x hashcode() nao necessariamente o equals vai retornar true
    //x.equals(y)== false
    //y.hashcode() != x hashcode() x.equals(y) devera ser falso
    
    @Override
    public int hashCode() {
        return IMEI!=null ? IMEI.hashCode(): 1;
    
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "Celular{" + "nome=" + nome + ", IMEI=" + IMEI + '}';
    }
    
    
    
    
}
