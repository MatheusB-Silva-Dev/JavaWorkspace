package Collections.LinkedHashSet;

/*Desafio Rápido: Lista de Modelos de Carros Únicos
🎯 Objetivo:
Criar um programa que simule uma lista de modelos de carros sem repetições, mantendo a ordem de inserção.

📋 Regras:
Crie um LinkedHashSet<String> chamado carros.

Adicione os seguintes modelos:
        "Gol", "Civic", "Corolla", "Onix", "Civic", "Fiesta", "Gol".

Mostre o número total de modelos únicos cadastrados.

Remova o modelo "Fiesta".

Verifique se o modelo "Corolla" ainda está presente.

Imprima todos os modelos com o seguinte formato:

🚗 Modelo: <nome>
🧠 Bônus (se quiser ir além):
Tente adicionar null e veja o que acontece.

        Adicione "civic" (com letra minúscula). Ele será tratado como duplicado?*/

import java.util.LinkedHashSet;

public class Exercicio01 {
    public static void main(String[] args) {
        LinkedHashSet<String> carros = new LinkedHashSet<String>();

        carros.add("Gol");
        carros.add("Civic");
        carros.add("Corolla");
        carros.add("Onix");
        carros.add("Civic");
        carros.add("Fiesta");
        carros.add("Gol");

        System.out.println("Lista inicial: " + carros);

        System.out.println("Número total de modelos cadastrados: " + carros.size());

        System.out.println("Removendo Fiesta da lista: " + carros.remove("Fiesta"));

        System.out.println("Corolla esta na lista? " + carros.contains("Corolla"));

        for(String modelo : carros) {
            System.out.println("Modelo: " + modelo);
        }

        //bonus

        carros.add(null);
        carros.add("civic");

        System.out.println("Lista final: " + carros);
    }
}
