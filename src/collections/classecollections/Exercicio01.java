package collections.classecollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        //cria uma lista fixa de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //ordena a lista em ordem crescente
        Collections.sort(numeros);
        System.out.println("Lista ordenada com Sort" + numeros);

        //obtem o maior número da lista
        Integer max = Collections.max(numeros);
        System.out.println("Maior número da lista: "  + max);

        //obtem o menor número da lista
        Integer min = Collections.min(numeros);
        System.out.println("Menor número da lista: "  + min);

        //embaralha a lista aleatoriamente
        Collections.shuffle(numeros);
        System.out.println("Números embaralhados: "  + numeros);

    }
}
