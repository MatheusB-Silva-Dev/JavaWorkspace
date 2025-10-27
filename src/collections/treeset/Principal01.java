package collections.treeset;

import java.util.TreeSet;

public class Principal01 {

    public static void main(String[] args) {

        TreeSet<String> playerSet = new TreeSet<String>();

        playerSet.add("Sonia");
        playerSet.add("Zelia");
        playerSet.add("Marcos");
        playerSet.add("Belém");
        playerSet.add("Verônica");
        playerSet.add("Juliana");
        playerSet.add("Esmael");
        playerSet.add("Uriel");
        playerSet.add("Pedro");
        playerSet.add("Vanessa");

        playerSet.add("Sonia"); // Esse é um elemento duplicado, logo, não será adicionado novamente

        //abaixo imprimira a lista em ordem alfabética
        System.out.println("Set Original:" + playerSet);

        System.out.println("Primeiro Nome: "+ playerSet.first());

        System.out.println("Último Nome: "+ playerSet.last());

        //cria subset
        TreeSet<String> newPlySet = (TreeSet<String>) playerSet.subSet("Marcos", "Vanessa");

        System.out.println("Sub set: " + newPlySet);

    }

}
