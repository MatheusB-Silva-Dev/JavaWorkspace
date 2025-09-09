package Excecoes.ExcecoesCheckedUnchecked;

/*Desafio Alternativo: "Sistema de Cadastro e Relatório"

Objetivo: Treinar exceções checked e unchecked em um fluxo mais "real" de programa.

Parte 1 – Leitura de arquivo (Checked)

Tente ler um arquivo usuarios.txt (cada linha é um nome).

Se não existir, capture IOException e mostre: "Erro ao abrir arquivo: <mensagem>".

Parte 2 – Operações matemáticas (Unchecked)

Peça a idade do usuário.

Calcule uma operação qualquer, ex: 100 / idade.

        Se idade = 0 → capture ArithmeticException.

Parte 3 – Acesso a array (Unchecked)

Crie um array com 3 cargos: {"Estagiário", "Analista", "Gerente"}.

Peça ao usuário um número (0–2).

Mostre o cargo correspondente.

Se for inválido → capture ArrayIndexOutOfBoundsException.

Finally

Sempre mostre "Programa encerrado. Obrigado!".*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //checked
        try{
            BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"));
            String linha = reader.readLine();
            reader.close();
        } catch(IOException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }

        //unchecked
        try{
            int num = 100;
            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt();

            int resul = num / idade;
            System.out.println("Resultado da divisão: " + resul);

        }catch(ArithmeticException e) {
            System.out.println("Idade não pode ser zero!");
        }

        //unchecked
        try {
            String[] cargos = {"Estagiário", "Analista", "Gerente"};
            System.out.println("Digite um numero de 0 a 2: ");
            int numero = teclado.nextInt();
            System.out.println("Cargo correspndente ao indice: " + cargos[numero]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indice inexistente!");

        }finally {
            System.out.println("Programa encerrado. Obrigado!");
            teclado.close();
        }

    }
}
