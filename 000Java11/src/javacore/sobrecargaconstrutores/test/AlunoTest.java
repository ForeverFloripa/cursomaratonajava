    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.sobrecargaconstrutores.test;

import javacore.sobrecargaconstrutores.classes.Aluno;

/**
 *
 * @author User
 */
public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("andre", "111222333",new double[]{10,8,9});
        aluno.imprime();
    }
            
    
}
