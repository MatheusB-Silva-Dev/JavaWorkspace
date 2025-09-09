package CollectionsPT2.ClasseCollections;

import java.util.Collections;

import java.util.*;

public class Principal02 {

    public static void main(String[] args) {

        List <Integer>minhaPrimeiraLista = new ArrayList<Integer>();

        List <Integer> minhaSegundaLista = new ArrayList<Integer>();

        minhaPrimeiraLista.add(10);

        minhaPrimeiraLista.add(20);

        minhaPrimeiraLista.add(20);

        minhaPrimeiraLista.add(50);

        minhaPrimeiraLista.add(70);

        minhaSegundaLista.add(11);

        minhaSegundaLista.add(120);

        minhaSegundaLista.add(120);

        minhaSegundaLista.add(150);

        minhaSegundaLista.add(170);



        System.out.println("Primeira lista-"+ minhaPrimeiraLista);

        System.out.println("Segunda lista-"+ minhaSegundaLista);

        Collections.copy(minhaSegundaLista, minhaPrimeiraLista );

        System.out.println("Segunda lista depois da cópia-"+ minhaSegundaLista);

    }

}