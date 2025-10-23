package Collections.Vector;

/*Desafio: Sistema de Cadastro de Livros com Vector
🎯 Objetivo:
Simular um sistema que armazena livros com base em um Vector<String>, onde cada livro é representado pelo título. O sistema deve permitir diversas operações sobre os livros.

📋 Regras:
Crie um Vector<String> chamado livros.

Adicione os seguintes livros:

        "O Senhor dos Anéis"

        "Dom Quixote"

        "1984"

        "O Hobbit"

        "Dom Casmurro"

        "O Senhor dos Anéis" (repetido intencionalmente)

Mostre o primeiro e o último livro da lista.

Verifique se o livro "1984" está presente na lista.

Mostre o número total de livros cadastrados.

Remova o livro "Dom Quixote" da lista.

Substitua o livro no índice 2 por "A Revolução dos Bichos".

Liste todos os livros com o seguinte formato:

📚 Livro [índice]: <nome>
🧠 Bônus (nível +1):
Verifique se a lista está vazia.

Adicione um novo livro na primeira posição usando insertElementAt(...).

Limpe toda a lista e mostre a confirmação de que está vazia.*/


import java.util.Vector;

public class Exercicio01 {
    public static void main(String[] args) {
        Vector<String> livros = new Vector<String>();

        livros.add("O Senhor dos Anéis");
        livros.add("Dom Quixote");
        livros.add("1984");
        livros.add("O Hobbit");
        livros.add("Dom Casmurro");
        livros.add("O Senhor dos Anéis");

        System.out.println("Lista Inicial: " + livros);

        System.out.println("Primeiro livro da lista: " + livros.firstElement());
        System.out.println("Último livro da lista: " + livros.lastElement());
        System.out.println("O livro 1984 está presente na lista? " + livros.contains("1984"));
        System.out.println("Qual o numero total de livros cadastrados? " + livros.size());

        System.out.println("Removendo o livro Dom Quixote " + livros.remove("Dom Quixote"));
        livros.set(2, "A Revolução dos Bichos");

        for(int i = 0; i < livros.size(); i++) {
            System.out.println(i+ " Livro: " + livros.get(i));
        }

        for(String a : livros) {
            System.out.println("Livro: " + a);
        }

        System.out.println("A lista esta vazia? " + livros.isEmpty());
        livros.insertElementAt("Meu Livro", 0);
        System.out.println("Lista atualizada: " + livros);
        livros.clear();
        System.out.println("A lista esta vazia? " + livros.isEmpty());

    }
}
