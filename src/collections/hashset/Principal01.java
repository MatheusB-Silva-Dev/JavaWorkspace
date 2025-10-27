package collections.hashset;
import java.util.HashSet;

public class Principal01 {

    public static void main(String[] args) {

        //cria o hashset de string
        HashSet<String> hs = new HashSet<String>();
        //adicionando elementos ao HashSet
        hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");
        hs.add("X");

        System.out.println("Tamanho do HashSet= " + hs.size());

        System.out.println("HashSet Original:" + hs);

        System.out.println("Remover A do HashSet: " + hs.remove("A"));

        System.out.println("Tentando remover Z, o qual não está presente: " + hs.remove("Z"));

        System.out.println("Verificando se M está presente= " + hs.contains("M"));

        System.out.println("HashSet atualizado: " + hs);

    }

}