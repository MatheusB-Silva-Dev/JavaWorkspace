package Collections.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Principal01 {

        public static void main(String[] args) {
            List<String> frutas = new ArrayList<>(Arrays.asList("banana", "maçã", "uva", "abacaxi"));

            // Ordena por tamanho da palavra, de forma crescente
            Collections.sort(frutas, new Comparator<String>() {
                public int compare(String f1, String f2) {
                    return f1.length() - f2.length();
                }
            });

            System.out.println(frutas); // [uva, maçã, banana, abacaxi]
        }

}
