package collections.linkedlist;

import java.util.LinkedList;

public class Principal01 {

    public static void main(String[] args) {

        //cria uma LinkedList de String
        LinkedList<String> minhaLinkedList = new LinkedList<String>();

        //adiciona elementos na lista
        minhaLinkedList.addFirst("A");
        minhaLinkedList.add("B");
        minhaLinkedList.add("C");
        minhaLinkedList.add("D");
        minhaLinkedList.add(2, "X"); // adiciona "X" na posição 2, deslocando os seguintes
        minhaLinkedList.addLast("Z");

        //imprime lista antes de remover elementos
        System.out.println("Lista antes de eliminar elementos" + minhaLinkedList);

        minhaLinkedList.removeFirst();  // remove o primeiro elemento
        minhaLinkedList.removeLast(); // remove o ultimo elemento
        minhaLinkedList.remove("C"); // remove o elemento "C"

        //imprime lista depois das remoções
        System.out.println("Lista depois de eliminar elementos: ");
        System.out.println(minhaLinkedList);

        //acessa elementos da lista
        System.out.println("Primeiro objeto: " + minhaLinkedList.getFirst());
        System.out.println("Último objeto: " + minhaLinkedList.peekLast());

    }

}