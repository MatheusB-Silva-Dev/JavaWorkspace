package Excecoes.ExcecoesCheckedUnchecked;

/*Crie um programa com menu simples:

Opção 1: Pedir ao usuário o caminho de um arquivo e tentar ler.

Se o arquivo não existir, capturar a exceção checked (IOException) e mostrar: "Arquivo não encontrado: <mensagem>".

Opção 2: Pedir dois números e tentar dividir.

Se o usuário digitar o divisor zero, capturar a exceção unchecked (ArithmeticException) e mostrar: "Erro: divisão por zero não é permitida".

No final, o programa deve imprimir "Programa finalizado com sucesso", independente do que aconteceu.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {

        //Checked Exception
        try{
            BufferedReader reader = new BufferedReader(new FileReader("arquivo_inexistente.txt"));
            String linha = reader.readLine();
            reader.close();
        } catch(IOException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }

        Scanner teclado = new Scanner(System.in);

        //Unchecked Exception
        try{
            System.out.println("Digite o primeiro número: ");
            int num1 = teclado.nextInt();

            System.out.println("Digite o segundo numero: ");
            int num2 = teclado.nextInt();

            new Exercicio01().dividir(num1, num2);

        } catch(ArithmeticException e)  {
            System.out.println("Divisão por zero não permitida!");
        } finally {
            System.out.println("Programa finalizado com sucesso!");
            teclado.close();
        }


    }

    public void dividir(int num1, int num2) {
        int resul = num1 / num2;
        System.out.println("Resultado da divisão: " + resul);
    }
}
