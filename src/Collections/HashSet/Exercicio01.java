package Collections.HashSet;

/*Desafio Rápido: Lista de Participantes Únicos
🎯 Objetivo:
Simular uma lista de participantes de um evento sem nomes duplicados, usando HashSet.

        📋 Regras:
Crie um HashSet<String> chamado participantes.

Adicione os nomes: "Ana", "Carlos", "João", "Carlos" (duplicado), "Maria", "Ana" (duplicado).

Mostre o número total de participantes únicos.

Verifique se "João" está presente na lista.

Remova "Carlos" da lista.

Imprima todos os nomes presentes no conjunto, com uma mensagem:
        → Participante: <nome>

🧠 Bônus (pra deixar afiado):
Tente adicionar "null" na lista. O que acontece?

Tente adicionar "joão" (com letra minúscula). O que acontece? (Pista: HashSet é case-sensitive)*/


import java.util.HashSet;

public class Exercicio01 {
    public static void main(String[] args){
        HashSet<String> participantes = new HashSet<String>();
        participantes.add("Ana");
        participantes.add("Carlos");
        participantes.add("João");
        participantes.add("Carlos");
        participantes.add("Maria");
        participantes.add("Ana");

        System.out.println("Primeira lista: " + participantes);

        System.out.println("Numero total de participantes únicos: " + participantes.size());

        System.out.println("João está presente na lista? " + participantes.contains("João"));

        participantes.remove("Carlos");

        System.out.println("Todos os participanntes listados atualizado:");
        for (String nome : participantes) {
            System.out.println("Participante: " + nome);
        }

        //bonus

        participantes.add("");
        participantes.add("joão");

        System.out.println("Todos os participanntes listados atualizado: " + participantes);
    }
}
