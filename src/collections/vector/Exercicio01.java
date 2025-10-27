package collections.vector;

import java.util.Vector;

public class Exercicio01 {
    public static void main(String[] args) {
        //cria um Vector de String vetor dinamico que permite elementos duplicados e e sincronizado
        Vector<String> livros = new Vector<String>();

        //adiciona livros ao Vector
        livros.add("O Senhor dos Anéis");
        livros.add("Dom Quixote");
        livros.add("1984");
        livros.add("O Hobbit");
        livros.add("Dom Casmurro");
        livros.add("O Senhor dos Anéis"); //duplicado permitido

        System.out.println("Lista Inicial: " + livros);

        System.out.println("Primeiro livro da lista: " + livros.firstElement());
        System.out.println("Último livro da lista: " + livros.lastElement());
        System.out.println("O livro 1984 está presente na lista? " + livros.contains("1984"));
        System.out.println("Qual o numero total de livros cadastrados? " + livros.size());

        System.out.println("Removendo o livro Dom Quixote " + livros.remove("Dom Quixote"));

        //substitui o elemento no indice 2
        livros.set(2, "A Revolução dos Bichos");

        //itera pela lista usando indice
        for(int i = 0; i < livros.size(); i++) {
            System.out.println(i+ " Livro: " + livros.get(i));
        }

        //itera pela lista usando foreach
        for(String a : livros) {
            System.out.println("Livro: " + a);
        }

        System.out.println("A lista esta vazia? " + livros.isEmpty());
        livros.insertElementAt("Meu Livro", 0);  //insere elemento em uma posição especifica
        System.out.println("Lista atualizada: " + livros);

        //remove todos os elementos da lista
        livros.clear();
        System.out.println("A lista esta vazia? " + livros.isEmpty());

    }
}
