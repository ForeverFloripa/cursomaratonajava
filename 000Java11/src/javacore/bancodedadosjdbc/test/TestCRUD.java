/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.test;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestCRUD {
    
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if (op == 0) {
                System.out.println("Saindo do sistema");
                break;
            }
            if (op == 1) {
                menuComprador();
                op = Integer.parseInt(teclado.nextLine());
                CompradorCRUD.executar(op);
                break;
            }
            if (op == 2) {
                menuCarro();
                op = Integer.parseInt(teclado.nextLine());
                CarroCRUD.executar(op);
                break;
            }
            CompradorCRUD.executar(op);
        }
        
    }
    
    private static void menu() {
        System.out.println("Selecione uma opçao: ");
        System.out.println("1 para Comprador");
        System.out.println("2 para Carro");
        System.out.println("0 para Sair");
    }
    
    private static void menuComprador() {
        System.out.println("Digite a opcao para comecar: ");
        System.out.println("1 Inserir Comprador");
        System.out.println("2 Atualizar Comprador");
        System.out.println("3 Listar todos os compradores");
        System.out.println("4 Buscar comprador por nome");
        System.out.println("5 Deletar Comprador");
        System.out.println("9 Voltar");
    }
    
    private static void menuCarro() {
        System.out.println("Digite a opcao para comecar: ");
        System.out.println("1 Inserir Carro");
        System.out.println("2 Atualizar Carro");
        System.out.println("3 Listar todos os Carro");
        System.out.println("4 Buscar Carro por nome");
        System.out.println("5 Deletar Carro");
        System.out.println("9 Voltar");
    }

  
}
