package Collections.ArrayList;

/*Desafio Rápido para Fixar
Crie um programa que:

Crie uma ArrayList<String> chamada compras.

Adicione os seguintes itens: "Arroz", "Feijão", "Macarrão", "Óleo".

Insira "Café" na segunda posição.

Verifique se "Leite" está na lista e imprima a resposta.

        Remova "Óleo" da lista.

Imprima todos os itens com seus respectivos índices.*/

import java.util.ArrayList;

public class Exercicio {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Macarrão");
        lista.add("Óleo");

        lista.add(1, "Café");

        System.out.println("Contem o item Leite na lista: " + lista.contains("Leite"));

        lista.remove(4);

        for(String s : lista) {
            System.out.println(s);
        }


    }
}
