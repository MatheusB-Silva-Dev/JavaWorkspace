package collections.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Principal01 {

        public static void main(String[] args) {
            //cria uma lista de frutas usando ArrayList e Arrays.asList
            List<String> frutas = new ArrayList<>(Arrays.asList("banana", "maçã", "uva", "abacaxi"));

            //ordena a lista usando Collections.sort() com um Comparator anônimo
            //o Comparator define a ordem baseada no tamanho da palavra
            Collections.sort(frutas, new Comparator<String>() {
                public int compare(String f1, String f2) {
                    //retorna a diferença entre os tamanhos das palavras
                    //se f1 for menor que f2, vai para frente, se maior, vai para trás
                    return f1.length() - f2.length();
                }
            });

            //imprime a lista ordenada pelo tamanho das palavras
            System.out.println(frutas); // [uva, maçã, banana, abacaxi]
        }

}
