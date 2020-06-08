/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.completablefuture.classes;

import java.text.DecimalFormat;

/**
 *
 * @author User
 */
public class Orcamento {
    private final String nomeLoja;
    private final double preco;
    private final Desconto.Codigo codigoDesconto;

    private Orcamento(String nomeLoja, double preco, Desconto.Codigo codigoDesconto) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.codigoDesconto = codigoDesconto;
    }
    
    public static Orcamento parse(String s){
        String[] split = s.split(":");
        String nomeLoja = split[0];
        double preco = Double.parseDouble(split[1].replaceAll(",","."));
        Desconto.Codigo codigoDesconto = Desconto.Codigo.valueOf(split[2]);
        return new Orcamento(nomeLoja,preco,codigoDesconto);
    }
    
    

    public String getNomeLoja() {
        return nomeLoja;
    }

    public double getPreco() {
        return preco;
    }

    public Desconto.Codigo getCodigoDesconto() {
        return codigoDesconto;
    }
}


//essa classe é imutavel, toda vez que quizer alterar um valor tenho que ter um novo objeto orcamento 