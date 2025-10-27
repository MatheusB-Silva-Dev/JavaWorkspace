package collections.linkedhashset;

import java.util.LinkedHashSet;

public class Exercicio01 {
    public static void main(String[] args) {
        //cria um LinkedHashSet de String
        //LinkedHashSet mantem a ordem de inserção e não permite duplicatas
        LinkedHashSet<String> carros = new LinkedHashSet<String>();

        //adiciona elementos
        carros.add("Gol");
        carros.add("Civic");
        carros.add("Corolla");
        carros.add("Onix");
        carros.add("Civic"); //duplicata não sera adicionada
        carros.add("Fiesta");
        carros.add("Gol"); // duplicata não sera adicionada

        //imprime a lista inicial já sem duplicatas
        System.out.println("Lista inicial: " + carros);

        //mostra o número total de elementos únicos no conjunto
        System.out.println("Número total de modelos cadastrados: " + carros.size());

        //remove o elemento "Fiesta" do conjunto
        System.out.println("Removendo Fiesta da lista: " + carros.remove("Fiesta"));

        //verifica se "Corolla" está presente no conjunto
        System.out.println("Corolla esta na lista? " + carros.contains("Corolla"));

        //percorre o conjunto imprimindo todos os elementos
        for(String modelo : carros) {
            System.out.println("Modelo: " + modelo);
        }


        carros.add(null); // permite somente um null
        carros.add("civic"); //adiciona "civic" diferente de "Civic" por causa de case-sensitive

        //imprime o conjunto final após as alterações
        System.out.println("Lista final: " + carros);
    }
}
