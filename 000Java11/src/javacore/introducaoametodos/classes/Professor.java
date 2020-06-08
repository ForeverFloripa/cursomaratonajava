    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaoametodos.classes;

/**
 *
 * @author User
 */
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;
    
    
//    public void imprime(Professor aux){
//         System.out.println(aux.matricula);   
//         System.out.println(aux.nome);   
//         System.out.println(aux.cpf);   
//         System.out.println(aux.rg); 
//         System.out.println("Dentro do imnprime o nome "+ aux.nome+ " sendo alterado para: ");
//         aux.nome="mariana alterado";
//         System.out.println(aux.nome);
//        }
    public void imprime(){
         System.out.println("_________________");
         System.out.println(this.matricula);   
         System.out.println(this.nome);   
         System.out.println(this.cpf);   
         System.out.println(this.rg); 
         System.out.println("_________________");
        
    }
    
}
