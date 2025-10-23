package Collections.LinkedList;

/*Desafio: Lista de tarefas
🧪 Objetivo:
Criar um programa que simule uma lista de tarefas usando LinkedList<String>.

🔧 Regras:
Crie uma LinkedList<String> chamada tarefas.

Adicione as seguintes tarefas, nesta ordem:

        "Estudar Java"

        "Fazer exercício"

        "Enviar currículo"

        "Organizar ambiente de estudos"

Adicione a tarefa "Tomar café" no início da lista.

Adicione a tarefa "Dormir" no fim da lista.

Remova a tarefa "Fazer exercício".

Mostre o tamanho da lista.

Mostre a primeira e a última tarefa.

Mostre todas as tarefas com seus índices.

Mostre se a tarefa "Lavar a louça" está na lista.

🧠 Bônus (se quiser ir além):
Remova a primeira e a última tarefa usando removeFirst() e removeLast().

Adicione uma nova tarefa no índice 2.*/

import java.util.LinkedList;

public class Exercicio01 {
    public static void main(String[] args){
        LinkedList<String> tarefa = new LinkedList<String>();

        tarefa.add("Estudar Java");
        tarefa.add("Fazer exercício");
        tarefa.add("Enviar curriculo");
        tarefa.add("Organizar ambiente de estudos");

        System.out.println("Lista inicial: " + tarefa);

        tarefa.addFirst("Tomar café");
        tarefa.addLast("Dormir");
        tarefa.remove("Fazer exercício");

        System.out.println("Atualização da lista: " + tarefa);

        System.out.println("Tamanho da lista: " + tarefa.size());

        System.out.println("Primeira tarefa: " + tarefa.get(0));
        System.out.println("Ultima tarefa: " + tarefa.getLast());
        System.out.println("Lavar a louça esta na lista? " + tarefa.contains("Lavar a louça"));

        //Bonus
        tarefa.removeFirst();
        tarefa.removeLast();
        tarefa.add(2, "Fazer dieta");

        System.out.println("Atualização da lista: " + tarefa);

    }
}
