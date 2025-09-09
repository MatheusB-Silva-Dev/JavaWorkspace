package CollectionsPT2.ClasseCollections;

import java.util.Collections;

import java.util.ArrayList;

import java.util.List;

public class Principal01 {

    public static void main(String[] args) {

        List<String> alunosLista = new ArrayList<>();

        alunosLista.add("Naomi");

        alunosLista.add("Maria");

        alunosLista.add("Amanda");

        alunosLista.add("Paulo");

        alunosLista.add("Sofia");

        alunosLista.add("Naomi");

        alunosLista.add("Zelia");

        System.out.println("Lista original " + alunosLista);

        Collections.sort(alunosLista);

        System.out.println("Lista ordenada alfabeticamente " + alunosLista);



        Collections.reverse(alunosLista);

        System.out.println("Lista invertida " + alunosLista);

        Collections.shuffle(alunosLista);

        System.out.println("Lista aleatória " + alunosLista);

        System.out.println("Verificando ocorrências de Naomi: "

                + Collections.frequency(alunosLista, "Naomi"));

    }

}