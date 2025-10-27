package collections.treemap;

/*Desafio: Cadastro de Alunos e Notas com TreeMap
Objetivo:
Criar um programa que:

Cadastre 5 alunos com suas notas (nome String, nota Double) usando um TreeMap.

Exiba todos os alunos e notas em ordem alfabética (automática do TreeMap).

Permita ao usuário consultar a nota de um aluno pelo nome.

Mostre o aluno com a maior nota e o aluno com a menor nota.

Passo a passo:
Use TreeMap<String, Double> para armazenar nome e nota.

        Use put() para cadastrar alunos.

Use entrySet() para exibir os alunos e notas.

Use containsKey() e get() para consulta.

Para encontrar maior e menor nota, percorra o map com um for-each e compare as notas, guardando o nome e nota do maior e menor.

Imprima os resultados.

        Dica:
Repita a lógica do “mais caro e mais barato” que vimos antes, só que agora para as notas.*/

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //cria um TreeMap para armazenar alunos e suas notas
        //TreeMap mantém as chaves em ordem natural
        Map<String, Double> alunos = new TreeMap<>();

        //entrada de dados: nome e nota de 5 alunos
        for(int i = 1; i <=5; i++) {
            System.out.println("Digite o nome do aluno " + i + ":");
            String aluno = teclado.nextLine();

            System.out.println("Digite a nota do aluno " + i + ":");
            Double nota = teclado.nextDouble();
            teclado.nextLine(); // limpar buffer

            alunos.put(aluno, nota); //adiciona no TreeMap
        }

        //mostra todos os alunos e suas notas
        for(Map.Entry <String, Double> entry : alunos.entrySet()) {
            System.out.println("Aluno: " + entry.getKey() + " | Nota: " + entry.getValue());
        }

        //busca um aluno específico pelo nome
        System.out.println("Buscar aluno e nota respectiva: ");
        String buscar = teclado.nextLine();

        if(alunos.containsKey(buscar)) {
            System.out.println("Buscando.... " + alunos.get(buscar));
        } else {
            System.out.println("Aluno não encontrado.");
        }

        //inicializa variaveis para maior e menor nota
        String maiorNotaAluno = null;
        double maiorNota = Double.MIN_VALUE;

        String menorNotaAluno = null;
        double menorNota = Double.MAX_VALUE;

        //percorre o TreeMap para encontrar maior e menor nota
        for(Map.Entry<String, Double> entry : alunos.entrySet()) {
            String nome = entry.getKey();
            double nota = entry.getValue();

            if(nota > maiorNota) {
                maiorNota = nota;
                maiorNotaAluno = nome;
            }

            if(nota < menorNota) {
                menorNota = nota;
                menorNotaAluno = nome;
            }
        }

        //imprime o aluno com maior e menor nota
        System.out.printf("Maior nota: %s (%.2f)\n", maiorNotaAluno, maiorNota);
        System.out.printf("Menor nota: %s (%.2f)\n", menorNotaAluno, menorNota);

    }
}
