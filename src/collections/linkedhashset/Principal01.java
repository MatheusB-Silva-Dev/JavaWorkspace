package collections.linkedhashset;

import java.util.LinkedHashSet;

public class Principal01 {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

        //adicionando elementos ao LinkedHashSet
        linkedset.add("Maruti");
        linkedset.add("BMW");
        linkedset.add("Honda");
        linkedset.add("Audi");
        linkedset.add("Maruti"); //Esse não adicionará o novo elemento pois Maruti ja existe

        // adiciona novo elemento
        linkedset.add("WalksWagon");

        System.out.println("Tamanho do LinkedHashSet = " + linkedset.size());

        System.out.println("LinkedHashSet Original: " + linkedset);

        System.out.println("Removendo Audi do LinkedHashSet: " + linkedset.remove("Audi"));

        System.out.println("Tentando remover Z, o qual não está presente: " + linkedset.remove("Z"));

        System.out.println("Verificando se Maruti está presente: " + linkedset.contains("Maruti"));

        System.out.println("LinkedHashSet atualizada: " + linkedset);

    }

}
