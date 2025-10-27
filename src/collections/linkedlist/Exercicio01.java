package collections.linkedlist;

import java.util.LinkedList;

public class Exercicio01 {
    public static void main(String[] args){
        //cria uma LinkedList de String
        //LinkedList mantém a ordem de inserção e permite elementos duplicados
        LinkedList<String> tarefa = new LinkedList<String>();

        //adiciona elementos na lista
        tarefa.add("Estudar Java");
        tarefa.add("Fazer exercício");
        tarefa.add("Enviar curriculo");
        tarefa.add("Organizar ambiente de estudos");

        //imprime a lista inicial
        System.out.println("Lista inicial: " + tarefa);

        // Adiciona elementos no início e no fim da lista
        tarefa.addFirst("Tomar café"); // inicio
        tarefa.addLast("Dormir"); //final
        tarefa.remove("Fazer exercício"); // remove o elemento "Fazer exercício"

        //mostra a lista após alterações
        System.out.println("Atualização da lista: " + tarefa);

        //mostra tamanho da lista
        System.out.println("Tamanho da lista: " + tarefa.size());

        //acessa elementos especificos
        System.out.println("Primeira tarefa: " + tarefa.get(0));
        System.out.println("Ultima tarefa: " + tarefa.getLast());

        //verifica se a lista contem determinado elemento
        System.out.println("Lavar a louça esta na lista? " + tarefa.contains("Lavar a louça"));

        //remove primeiro e ultimo elemento
        tarefa.removeFirst();
        tarefa.removeLast();

        //adiciona pelo indice
        tarefa.add(2, "Fazer dieta");

        //imrime a lista final
        System.out.println("Atualização da lista: " + tarefa);

    }
}
