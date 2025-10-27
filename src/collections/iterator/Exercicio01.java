package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio01 {
    public static void main(String[] args){
        //cria uma ArrayList de String chamada tarefas
        ArrayList<String> tarefas = new ArrayList<>();

        //adiciona varias tarefas na lista
        tarefas.add("Estudar Java");
        tarefas.add("Fazer Exercicio ok");
        tarefas.add("Enviar curriculo");
        tarefas.add("Lavar louça ok");
        tarefas.add("Resvisar estrutura de dados");
        tarefas.add("Limpar a casa ok");

        //cria um Iterator para percorrer a lista de tarefas
        Iterator<String> a = tarefas.iterator();

        //se a tarefa contém "ok", significa que já foi concluída
        //remove a tarefa da lista usando o iterator
        while(a.hasNext()) {
            String tarefa = a.next();
            if(tarefa.contains("ok")){
                a.remove();
            }
        }

        //mostra apenas as tarefas pendentes (sem "ok")
        System.out.println("\n Tarefas pendentes:");
        for (String t : tarefas) {
            System.out.println(" Tarefa pendente: " + t);
        }

    }
}
