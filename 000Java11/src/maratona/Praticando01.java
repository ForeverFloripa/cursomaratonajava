/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratona;

/**
 *
 * @author User
 */
public class Praticando01 {
    public static void main(String[] args) {
        int idade=3;
        
        switch ( idade){
            case 0:
            case 1:
            case 2:
                System.out.println("Menor que 3");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Maior ou igual a 3");
                break;
        
    }
                System.out.println("FORA do Break");
                
        System.out.println("_________________________");
        
        
        
        for(int i = 0; i <= idade; i++) {
            System.out.println("Testando contador ate a idade " + idade);
        System.out.println(i +" "+ idade);
            
        }
        System.out.println("Fora do for");
                
                
        
    }
    
}
