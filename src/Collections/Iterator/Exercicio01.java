package Collections.Iterator;
/*🎯 Objetivo:
Gerenciar uma lista de tarefas (com ArrayList<String>), percorrendo e removendo aquelas que foram marcadas como "concluídas".

        📋 Regras:
Crie um ArrayList<String> chamado tarefas.

Adicione as seguintes tarefas:

        "Estudar Java"

        "Fazer exercício ✅"

        "Enviar currículo"

        "Lavar louça ✅"

        "Revisar estrutura de dados"

        "Limpar a casa ✅"

Use um Iterator para:

Percorrer a lista.

Remover todas as tarefas que contêm "✅".

Mostre a lista final de tarefas pendentes com este formato:

📌 Tarefa pendente: <nome>*/

import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio01 {
    public static void main(String[] args){
        ArrayList<String> tarefas = new ArrayList<String>();

        tarefas.add("Estudar Java");
        tarefas.add("Fazer Exercicio ✅");
        tarefas.add("Enviar curriculo");
        tarefas.add("Lavar louça ✅");
        tarefas.add("Resvisar estrutura de dados");
        tarefas.add("Limpar a casa ✅");

        Iterator<String> a = tarefas.iterator();
        while(a.hasNext()) {
            String tarefa = a.next();
            if(tarefa.contains("✅")){
                a.remove();
            }
        }

        System.out.println("\n📌 Tarefas pendentes:");
        for (String t : tarefas) {
            System.out.println("📌 Tarefa pendente: " + t);
        }



    }
}
