package collections.arraylist;

import java.util.ArrayList;

public class Principal01 {
    public static void main(String[] args){
        /*ArrayList nomes = new ArrayList(); //Esse e o construtor padrão, cria sempre uma capacidade de 10 itens por padrão
        ArrayList nomes1 = new ArrayList(int size);
        ArrayList nomes2 = new ArrayList(Collection c);*/

        //declarando ArrayList de objetos String
        ArrayList<String> minhaLista = new ArrayList<String>();

        //Adicionando objetos à lista de matrizes no índice padrão
        minhaLista.add("Maçã");
        minhaLista.add("Manga");
        minhaLista.add("Laranja");
        minhaLista.add("Uvas");

        //Adicionando objeto a um índice específico

        minhaLista.add(1, "Laranja");
        minhaLista.add(2, "Abacaxi");

        System.out.println("Mostrar todos os objetos:");

        for(String s: minhaLista) {
            System.out.println(s);
        }

        System.out.println("Adicionando objeto ao índice 3 " + minhaLista.get(3));
        System.out.println("Caqui está na lista: " + minhaLista.contains("Caqui"));
        System.out.println("Tamanho do ArrayList: " + minhaLista.size());
        minhaLista.remove("Papaya");
        System.out.println("Novo tamanho do ArrayList: " + minhaLista.size());

    }
}