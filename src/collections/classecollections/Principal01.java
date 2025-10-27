package collections.classecollections;

//importa a classe Collections e outras
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Principal01 {

    public static void main(String[] args) {

        //cria uma lista de Strings chamada alunosLista
        List<String> alunosLista = new ArrayList<>();

        // Adiciona elementos na lista
        alunosLista.add("Naomi");
        alunosLista.add("Maria");
        alunosLista.add("Amanda");
        alunosLista.add("Paulo");
        alunosLista.add("Sofia");
        alunosLista.add("Naomi");
        alunosLista.add("Zelia");

        //exibe a lista original
        System.out.println("Lista original " + alunosLista);

        //ordena a lista alfabeticamente usando Collections.sort()
        Collections.sort(alunosLista);
        System.out.println("Lista ordenada alfabeticamente " + alunosLista);

        //embaralha os elementos da lista de forma aleatoria
        Collections.reverse(alunosLista);

        //inverte a ordem da lista
        System.out.println("Lista invertida " + alunosLista);

        //embaralha os elementos da lista de forma aleatoria
        Collections.shuffle(alunosLista);
        System.out.println("Lista aleatória " + alunosLista);

        //conta quantas vezes "Naomi" aparece na lista
        System.out.println("Verificando ocorrências de Naomi: "  + Collections.frequency(alunosLista, "Naomi"));

    }

}