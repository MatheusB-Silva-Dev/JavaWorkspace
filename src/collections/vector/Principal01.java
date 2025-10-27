package collections.vector;

import java.util.Vector;

public class Principal01 {

        public static void main(String[] args) {
            //cria um Vector de String
            Vector<String> nomes = new Vector<String>();

            //adiciona nomes ao vetor
            nomes.add("Carlos");
            nomes.add("Ana");
            nomes.add("Beatriz");

            //mostra todos os nomes
            System.out.println("Todos os nomes: " + nomes);

            //remove o elemento "Ana"
            nomes.remove("Ana");
            System.out.println("Após remover Ana: " + nomes);

            //retorna o primeiro e ultimo elemento do vetor
            System.out.println("Primeiro nome: " + nomes.firstElement());
            System.out.println("Último nome: " + nomes.lastElement());
        }
}
