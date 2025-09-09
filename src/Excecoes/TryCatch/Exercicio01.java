package Excecoes.TryCatch;
/*Desafio Simplificado: Subtração com Try-Catch
O que fazer:

Peça dois números inteiros ao usuário.

Faça a subtração (primeiro menos o segundo) dentro de um método.

Se o usuário digitar um valor inválido (ex: letra ao invés de número), capture a exceção e mostre uma mensagem tipo:
        "Entrada inválida! Digite apenas números inteiros."

Exiba o resultado da subtração caso tudo esteja correto.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro número: ");
            double num1 = teclado.nextDouble();
            teclado.nextLine();

            System.out.println("Digite o segundo número: ");
            double num2 = teclado.nextDouble();
            teclado.nextLine();

            new Exercicio01().subtrair(num1, num2);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite apenas números.");
        } finally {
            teclado.close();
        }
    }


    public void subtrair (double num1, double num2){
            double resultado = num1 - num2;
            System.out.println("Resultado de num 1 - num 2: " + resultado);
    }
}
