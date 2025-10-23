package Collections.Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal01 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");
        nomes.add("João");

        Iterator<String> it = nomes.iterator();

        while (it.hasNext()) {
            String nome = it.next();
            if (nome.equals("Carlos")) {
                it.remove(); // remove "Carlos" da lista
            } else {
                System.out.println("Nome: " + nome);
            }
        }

        System.out.println("Lista final: " + nomes);
    }

}