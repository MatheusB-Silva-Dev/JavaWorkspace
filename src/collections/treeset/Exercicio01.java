package collections.treeset;

import java.util.TreeSet;

public class Exercicio01 {
    public static void main(String[] args) {
        //cria um TreeSet de String que organiza automaticamente em ordem alfabetica
        TreeSet<String> palavras = new TreeSet<String>();

        //adiciona elementos ao TreeSet duplicados serão ignorados
        palavras.add("banana");
        palavras.add("abacaxi");
        palavras.add("laranja");
        palavras.add("uva");
        palavras.add("banana");
        palavras.add("melancia");
        palavras.add("uva");
        palavras.add("kiwi");
        palavras.add("abacate");

        //mostra o numero total de elementos unicos
        System.out.println("Numero total de palavras: " + palavras.size());

        System.out.println("A palavra maçã esta presente? " + palavras.contains("maçã"));


        //retorna o primeiro e o ultimo elemento do TreeSet ordem alfabetica
        System.out.println("Primeira palavra: " + palavras.first());
        System.out.println("Ultima palavra: " + palavras.last());

        //itera sobre o TreeSet imprimindo cada palavra
        for(String nome : palavras) {
            System.out.println("Fruta: " + nome);
        }

        //cria um subset (subconjunto) entre "kiwi" (inclusivo) e "uva" (exclusivo)
        TreeSet<String> NewSubSet = (TreeSet<String>) palavras.subSet("kiwi", "uva");
        System.out.println("SubSet: " + NewSubSet);

        //adiciona "Laranja" com maiúscula TreeSet diferencia maiusculas e minusculas
        palavras.add("Laranja");
        palavras.add(null);  //tentativa de adicionar null não permitido em TreeSet

        System.out.println("LLista final atualizada com Laranja maiscula: " + palavras);


    }
}
