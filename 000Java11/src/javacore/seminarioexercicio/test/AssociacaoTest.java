/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.seminarioexercicio.test;

import javacore.seminarioexercicio.classes.Aluno;
import javacore.seminarioexercicio.classes.Local;
import javacore.seminarioexercicio.classes.Professor;
import javacore.seminarioexercicio.classes.Seminario;

/**
 *
 * @author User
 */
public class AssociacaoTest {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("willian", 27);
        Aluno aluno2 = new Aluno("Joana Darc", 20);

        Seminario sem = new Seminario("como ser um baita Programador e ficar rico");
        Professor prof = new Professor("yoda", "Usar a força para programar");
        Local loc = new Local("Rua das Araras", "Meio do mato");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(loc);
        sem.setAlunos(new Aluno[]{});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        System.out.println("_____________________________");
        prof.print();

        aluno.print();
    }

}
