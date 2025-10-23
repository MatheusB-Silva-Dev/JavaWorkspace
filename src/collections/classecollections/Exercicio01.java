package CollectionsPT2.ClasseCollections;
/*Desafio Simplificado: Manipulação de Números Fixos com Collections
Objetivo:
Criar um programa que:

Declare uma lista List<Integer> com os números fixos: 7, 3, 9, 1, 5.

Ordene a lista usando Collections.sort().

Exiba o maior número da lista usando Collections.max().

Exiba o menor número da lista usando Collections.min().

Embaralhe a lista usando Collections.shuffle() e mostre a lista embaralhada.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Collections.sort(numeros);
        System.out.println("Lista ordenada com Sort" + numeros);

        Integer max = Collections.max(numeros);
        System.out.println("Maior número da lista: "  + max);

        Integer min = Collections.min(numeros);
        System.out.println("Menor número da lista: "  + min);

        Collections.shuffle(numeros);
        System.out.println("Números embaralhados: "  + numeros);




    }
}
