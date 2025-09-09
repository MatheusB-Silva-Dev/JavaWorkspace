package Excecoes.TryCathAninhados;

/*Desafio adaptado: Operações Matemáticas em Camadas

Try externo → trata entrada inválida (InputMismatchException).

Usuário deve digitar dois inteiros.

        Try do meio → trata divisão por zero (ArithmeticException).

Realiza a divisão: num1 / num2.

Try interno → trata multiplicação com um número fixo (ou alguma outra operação que possa gerar erro, por exemplo, overflow).

Aqui podemos apenas simular uma operação que poderia falhar, ou simplesmente mostrar que o bloco interno executa apenas após a divisão ter sucesso.

Finally em cada nível → imprimir mensagens diferentes:

        "Finalizando bloco interno"

        "Finalizando bloco do meio"

        "Finalizando bloco externo"*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Digite um número inteiro: ");
            int num1 = teclado.nextInt();

            System.out.println("Digite outro número inteiro: ");
            int num2 = teclado.nextInt();

            try{
                new Exercicio06().dividir(num1, num2);

            }catch (ArithmeticException e){
                System.out.println("Divisão por zero não permitida!");
            }finally {
                System.out.println("Finalizando bloco interno.");
            }

            try {
                int numero = 100;
                System.out.println("Digite um valor para multiplicar por 100: ");
                int num3 = teclado.nextInt();
                int resul = numero * num3;
                System.out.println("Resultado da multiplicação: " + resul);

            } catch (InputMismatchException e){
                System.out.println("Bloco teste, digite apenas número!");

            }finally {
                System.out.println("Finalizando bloco do meio!");
            }

        }catch (InputMismatchException e) {
            System.out.println("Digite apenas números!");
        }finally {
            System.out.println("Finalizando bloco Externo.");
        }
    }

    public void dividir(int num1, int num2){
        int resultado = num1 / num2;
        System.out.println("Resultado da divisão: " + resultado);
    }
}
