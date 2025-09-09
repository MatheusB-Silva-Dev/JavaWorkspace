package CollectionsPT2.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Principal01{
    public static void main(String[] args) {
        // Criando Map de frutas e os preços de cada uma
        Map<String, Integer> tMap = new TreeMap<String, Integer>();

        tMap.put("Laranja", 12);
        tMap.put("Maçã", 25);
        tMap.put("Manga", 45);
        tMap.put("Caqui", 10);
        tMap.put("Banana", 4);
        tMap.put("Morango", 90);

        System.out.println("Ordenar frutas por nome: " + tMap);

        tMap.put("Uva", 87);
        tMap.remove("Caqui");

        System.out.println("Conjunto de frutas ordenadas por nome atualizado: " + tMap);
    }
}
