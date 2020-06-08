/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.test;

import java.util.List;
import java.util.Scanner;
import javacore.bancodedadosjdbc.classes.Comprador;
import javacore.bancodedadosjdbc.db.CompradorDAO;

/**
 *
 * @author User
 */
public class CompradorCRUD {

    private static Scanner teclado = new Scanner(System.in);

    public static void executar(int op) {
        switch (op) {
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;

            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite o nome: ");
                buscarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;

        }

    }

    private static void inserir() {
        Comprador c = new Comprador();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("CPF: ");
        c.setCpf(teclado.nextLine());
        CompradorDAO.save(c);

    }

    public static List<Comprador> listar() {
        List<Comprador> compradorList = CompradorDAO.selectALl();
        for (int i = 1; i < compradorList.size(); i++) {
            Comprador c = compradorList.get(i);
            System.out.print("{" + i + "}" + c.getNome() + " " + c.getCpf());
            System.out.println("");

        }
        return compradorList;

    }

    private static void atualizar() {
        System.out.println("Selecione um dos compradores abaixo: ");
        List<Comprador> compradorList = listar();
        Comprador c = compradorList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou Enter para o mesmo");
        String nome = teclado.nextLine();
        System.out.println("Novo CPF ou Enter para o mesmo");
        String cpf = teclado.nextLine();
        if (!nome.isEmpty()) {
            c.setNome(nome);
        }
        if (!cpf.isEmpty()) {
            c.setCpf(cpf);
        }
        CompradorDAO.update(c);

    }

    private static void buscarPorNome(String nome) {
        List<Comprador> compradorList = CompradorDAO.searchByName(nome);
        for (int i = 0; i < compradorList.size(); i++) {
            Comprador c = compradorList.get(i);
            System.out.print("{" + c.getId() + "}" + c.getNome() + " " + c.getCpf());
            System.out.println("");

        }

    }

    private static void deletar() {
        System.out.println("Selecione o registro paraa deletar: ");
        List<Comprador> compradorList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza S/N");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            CompradorDAO.delete(compradorList.get(index));
        }

    }

}
