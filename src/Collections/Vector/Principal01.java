package Collections.Vector;

import java.util.Vector;

public class Principal01 {

        public static void main(String[] args) {
            Vector<String> nomes = new Vector<String>();

            nomes.add("Carlos");
            nomes.add("Ana");
            nomes.add("Beatriz");

            System.out.println("Todos os nomes: " + nomes);

            nomes.remove("Ana");
            System.out.println("Após remover Ana: " + nomes);

            System.out.println("Primeiro nome: " + nomes.firstElement());
            System.out.println("Último nome: " + nomes.lastElement());
        }
}
