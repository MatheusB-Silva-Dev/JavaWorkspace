import java.util.LinkedList;

public class Principal01 {

    public static void main(String[] args) {

        LinkedList<String> minhaLinkedList = new LinkedList<String>();

        minhaLinkedList.addFirst("A");

        minhaLinkedList.add("B");

        minhaLinkedList.add("C");

        minhaLinkedList.add("D");

        minhaLinkedList.add(2, "X");//adiciona C ao index 2

        minhaLinkedList.addLast("Z");

        System.out.println("Lista antes de eliminar elementos");

        System.out.println(minhaLinkedList);

        minhaLinkedList.remove();

        minhaLinkedList.removeLast();

        minhaLinkedList.remove("C");

        System.out.println("Lista depois de eliminar o primeiro e o último objeto");

        System.out.println(minhaLinkedList);

        System.out.println("Primeiro objeto: "+ minhaLinkedList.getFirst());

        System.out.println("Último objeto: "+ minhaLinkedList.peekLast());

    }

}