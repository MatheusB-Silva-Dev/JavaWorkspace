package collections.arraylist;

import java.util.ArrayList;

public class Exercicio {
    public static void main(String[] args) {
        //cria um ArrayList de String chamado lista
        ArrayList<String> lista = new ArrayList<>();

        //adiciona elementos no final da lista
        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Macarrão");
        lista.add("Óleo");

        //adiciona "Café" no índice 1 empurrando os elementos
        lista.add(1, "Café");

        //verifica se a lista contém o item "Leite"
        System.out.println("Contem o item Leite na lista: " + lista.contains("Leite"));

        //remove o elemento no índice 4 ("Óleo")
        lista.remove(4);

        //percorre todos os elementos da lista e imprime
        for(String s : lista) {
            System.out.println(s);
        }

    }
}
