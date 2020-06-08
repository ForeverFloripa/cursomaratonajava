/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.test;

import java.util.List;
import java.util.Scanner;
import javacore.bancodedadosjdbc.classes.Carro;
import javacore.bancodedadosjdbc.classes.Comprador;
import javacore.bancodedadosjdbc.db.CarroDAOImpl;
import javacore.bancodedadosjdbc.interfaces.CarroDAO;

/**
 *
 * @author User
 */
public class CarroCRUD {
     private static Scanner teclado = new Scanner(System.in);
     private static CarroDAO dao = new CarroDAOImpl();

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
        Carro c = new Carro();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Placa: ");
        c.setPlaca (teclado.nextLine());
        System.out.println("Selecione um dos compradores abaixo: ");
        List<Comprador> compradorList =CompradorCRUD.listar();
        c.setComprador(compradorList.get(Integer.parseInt(teclado.nextLine())));
        dao.save(c);

    }

    private static List<Carro> listar() {
        List<Carro> carroList = dao.selectAll();
        for (int i = 0; i < carroList.size(); i++) {
            Carro c = carroList.get(i);
            System.out.println("{" + i + "}" + c.getNome() + " " + c.getPlaca()+ " "+ c.getComprador().getNome());
            System.out.println("");

        }
        return carroList;

    }

    private static void atualizar() {
        System.out.println("Selecione um dos carros abaixo: ");
        List<Carro> carroList = listar();
        Carro c = carroList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou Enter para o mesmo");
        String nome = teclado.nextLine();
        System.out.println("Nova Placa ou Enter para o mesmo");
        String placa = teclado.nextLine();
        if (!nome.isEmpty()) {
            c.setNome(nome);
        }
        if (!placa.isEmpty()) {
            c.setPlaca(placa);
        }
        dao.update(c);

    }

    private static void buscarPorNome(String nome) {
        List<Carro> carroList = dao.searchByName(nome);
        for (int i = 0; i < carroList.size(); i++) {
            Carro c = carroList.get(i);
            System.out.print("{" + c.getId() + "}" + c.getNome() + " " + c.getPlaca()+ " "+c.getComprador().getNome());
            System.out.println("");

        }

    }

    private static void deletar() {
        System.out.println("Selecione o carro paraa deletar: ");
        List<Carro> carroList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza S/N");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            dao.delete(carroList.get(index));
        }

    }

}
