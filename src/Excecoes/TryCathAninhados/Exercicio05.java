package Excecoes.TryCathAninhados;

/*Desafio: Operações com Try-Catch Aninhado

Crie um programa que:

Peça dois números inteiros ao usuário.

Use try-catch externo para tratar entrada inválida (InputMismatchException).

Dentro do try externo, crie um try-catch interno para realizar uma divisão:

Se o denominador for 0, trate com o catch interno (ArithmeticException).

Se der certo, exiba o resultado normalmente.

No final, exiba sempre uma mensagem de finalização (use finally).

        🔹 Fluxo esperado

Usuário digita letra → cai no catch externo.

Usuário digita números, mas denominador 0 → cai no catch interno.

Usuário digita tudo certo → mostra o resultado.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Digite o primeiro número: ");
            int num1 = teclado.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = teclado.nextInt();

            try{
                new Exercicio05().dividir(num1, num2);

            }catch(ArithmeticException e){
                System.out.println("Divisão por zero não permitida!");
            }

        }catch(InputMismatchException e) {
            System.out.println("Digite somente numeros inteiros!");
        }finally {
            System.out.println("Operação finalizada!");
            teclado.close();
        }

    }
    public void dividir(int num1, int num2){
        int resultado = num1 / num2;
        System.out.println("Resultado da divisão: " + resultado);
    }
}
