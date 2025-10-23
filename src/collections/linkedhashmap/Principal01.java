package CollectionsPT2.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Principal01 {
        public static void main(String[] args) {

            // Aqui o pedido de inserção mantém
            Map<Integer, String> lmap = new LinkedHashMap<>();

            lmap.put(12, "Maria");
            lmap.put(5, "Nicole");
            lmap.put(23, "Samuel");
            lmap.put(9, "Sonia");

            System.out.println("LinkedHashMap antes da modificação: " + lmap);

            System.out.println("Funcionário ID 12 existe? " + lmap.containsKey(12));
            System.out.println("Funcionário André existe? " + lmap.containsValue("Andre"));

            System.out.println("Número total de funcionários: " + lmap.size());

            System.out.println("Removendo funcionário com ID 5: " + lmap.remove(5));
            System.out.println("Removendo funcionário com ID 3 (o qual não existe): " + lmap.remove(3));

            System.out.println("LinkedHashMap depois da modificação: " + lmap);
        }
    }


