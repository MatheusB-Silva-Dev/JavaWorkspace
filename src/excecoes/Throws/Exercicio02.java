package Excecoes.Throws;
/*Desafio: Divisão com throws e try-catch
O que fazer:

Crie um método chamado dividir que receba dois int como parâmetros e retorne o resultado da divisão a / b.

Declare que esse método lança uma exceção do tipo ArithmeticException usando throws.

No método main, peça para o usuário digitar dois números inteiros.

Chame o método dividir dentro de um bloco try.

Capture a exceção ArithmeticException no catch e mostre a mensagem:
        "Erro: divisão por zero não é permitida!"

Se a divisão for bem-sucedida, imprima o resultado.

        Extras:

Use o Scanner para ler os números do usuário.

Trate o fechamento do Scanner ao final.*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = teclado.nextInt();

        try{
           new Exercicio02().dividir(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é permitida.");
        } finally {
            teclado.close();
        }

    }

    public void dividir(int a, int b) throws ArithmeticException {
        int resultado = a / b;
        System.out.println("Resultado da divisão: " + resultado);
    }
}
