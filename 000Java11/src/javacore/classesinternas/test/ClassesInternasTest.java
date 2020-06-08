/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.classesinternas.test;

public class ClassesInternasTest {
    private String nome="Willian do DEVDojo";
    
    class Interna{
        public void verClasseExterna(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTest.this);
        }
    }

    public static void main(String[] args) {
//        Externa externa = new Externa();
//        Externa.Interna in = externa.new Interna();
//        in.verClasseExterna();
        ClassesInternasTest externa = new ClassesInternasTest();
        ClassesInternasTest.Interna in = externa.new Interna();
        ClassesInternasTest.Interna in2 =  new ClassesInternasTest().new Interna();
        in.verClasseExterna();
        in2.verClasseExterna();
        

    }

}

//class Externa {
//
//    private String nome = " Willian Jedi do DevDojo";
//
//    class Interna {
//        public void verClasseExterna(){
//            System.out.println(nome);
//        }
//    }
//}
