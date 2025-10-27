package collections.hashset;

import java.util.HashSet;

public class Exercicio01 {
    public static void main(String[] args){
        //cria um HashSet de Strings chamado participantes
        //hashSet não permite duplicatas e não mantém ordem
        HashSet<String> participantes = new HashSet<String>();
        participantes.add("Ana");
        participantes.add("Carlos");
        participantes.add("João");
        participantes.add("Carlos"); //duplicata sera ignorada
        participantes.add("Maria");
        participantes.add("Ana"); //duplicata sera ignorada


        //imprime todos os participantes únicos
        System.out.println("Primeira lista: " + participantes);

        //mostra quantos participantes unicos existem
        System.out.println("Numero total de participantes únicos: " + participantes.size());

        //verifica se "João" esta presente no HashSet
        System.out.println("João está presente na lista? " + participantes.contains("João"));

        //remove "Carlos" do HashSet
        participantes.remove("Carlos");

        //lista todos os participantes apos remoção
        System.out.println("Todos os participanntes listados atualizado:");
        //percorre toda a lista e mostra no console
        for (String nome : participantes) {
            System.out.println("Participante: " + nome);
        }

        //adiciona uma string vazia e um nome diferente ("joão" minúsculo)
        //"joão" é diferente de "João", HashSet diferencia maiusculas de minusculas
        participantes.add("");
        participantes.add("joão");

        //mostra novamente todos os participantes
        System.out.println("Todos os participanntes listados atualizado: " + participantes);
    }
}
