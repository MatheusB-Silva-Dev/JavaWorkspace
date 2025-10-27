package collections.iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal01 {

    public static void main(String[] args) {
        //cria um arraylist com nomes
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");
        nomes.add("João");

        //cria um Iterator para percorrer a lista
        Iterator<String> it = nomes.iterator();

        while (it.hasNext()) { //enquanto houver próximo elemento
            String nome = it.next(); //pega o próximo elemento
            if (nome.equals("Carlos")) { //se o nome for "Carlos"
                it.remove(); // //remove da lista usando o Iterator
            } else {
                System.out.println("Nome: " + nome); //imprime os demais nomes
            }
        }

        System.out.println("Lista final: " + nomes);
    }

}