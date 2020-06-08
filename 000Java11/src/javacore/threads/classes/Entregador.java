/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.threads.classes;

/**
 *
 * @author User
 */
public class Entregador implements Runnable{ 
    private ListaMembros listaMembros;
    public Entregador(ListaMembros listaMembros){
    this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread= Thread.currentThread().getName();
        System.out.println(nomeThread + " Comecando o trabalho de entrega");
        int qtPendente = listaMembros.getEmailsPendentes();
        boolean aberta = listaMembros.isAberta();
        while(aberta||qtPendente>0){
            try {
                String email = listaMembros.obterEmailMembro();
                if(email!=null){
                    System.out.println(nomeThread+ "Enviando email para "+ email);
                    Thread.sleep(2000);
                    System.out.println("Enviio para " + email  + "COncluido com sucesso");
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            aberta = listaMembros.isAberta();
            qtPendente= listaMembros.getEmailsPendentes();
        }
        System.out.println("Atividades Finalizadas");
    }
    
}
