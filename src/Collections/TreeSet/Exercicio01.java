package Collections.TreeSet;

/*Desafio Rápido: Lista de Palavras Ordenadas
🎯 Objetivo:
Criar um programa que simule uma lista de palavras únicas e ordenadas automaticamente com TreeSet<String>.

📋 Regras:
Crie um TreeSet<String> chamado palavras.

Adicione as seguintes palavras (algumas duplicadas):

"banana", "abacaxi", "laranja", "uva", "banana", "melancia", "uva", "kiwi", "abacate"
Imprima o número total de palavras únicas.

Verifique se a palavra "maçã" está presente no conjunto.

Mostre a primeira e a última palavra em ordem alfabética.

Imprima todas as palavras com o formato:

📚 Palavra: <nome>

🧠 Bônus:

Crie um subSet
 que vá de "kiwi" até "uva" (exclusivo).

Tente adicionar null ao TreeSet. O que acontece?

Tente adicionar "Laranja" (com inicial maiúscula). O que acontece? Onde ela aparece na ordenação?*/


import java.util.TreeSet;

public class Exercicio01 {
    public static void main(String[] args) {
        TreeSet<String> palavras = new TreeSet<String>();

        palavras.add("banana");
        palavras.add("abacaxi");
        palavras.add("laranja");
        palavras.add("uva");
        palavras.add("banana");
        palavras.add("melancia");
        palavras.add("uva");
        palavras.add("kiwi");
        palavras.add("abacate");

        System.out.println("Numero total de palavras: " + palavras.size());

        System.out.println("A palavra maçã esta presente? " + palavras.contains("maçã"));

        System.out.println("Primeira palavra: " + palavras.first());
        System.out.println("Ultima palavra: " + palavras.last());

        for(String nome : palavras) {
            System.out.println("Fruta: " + nome);
        }

        //bonus

        TreeSet<String> NewSubSet = (TreeSet<String>) palavras.subSet("kiwi", "uva");
        System.out.println("SubSet: " + NewSubSet);

        palavras.add("Laranja");
        palavras.add(null);

        System.out.println("LLista final atualizada com Laranja maiscula: " + palavras);


    }
}
