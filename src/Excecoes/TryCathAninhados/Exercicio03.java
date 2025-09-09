package Excecoes.TryCathAninhados;
/*Desafio: Calculadora Interativa com Try-Catch Aninhado
🧪 Objetivo:
Criar uma calculadora que:
        - Pede dois números ao usuário
- Pede a operação desejada: +, -, *, /
        - Executa a operação
- Trata os seguintes erros:
        - Entrada inválida (texto em vez de número)
- Operação inválida (símbolo desconhecido)
- Divisão por zero
- Conversão de texto para número

📋 Requisitos:
        - Use Scanner para entrada
- Use try-catch aninhado para tratar:
        - InputMismatchException
- ArithmeticException
- NumberFormatException
- IllegalArgumentException (operação inválida)
- Feche o Scanner corretamente
- Exiba mensagens amigáveis para cada erro*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("------Calculadora Interativa-------");

        try {
            System.out.println("Digite o primeiro número: ");
            int num1 = teclado.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = teclado.nextInt();

            teclado.nextLine();

            try {
                // Leitura da operação desejada
                System.out.print("Digite a operação desejada (+, -, *, /): ");
                String operacao = teclado.nextLine();

                int resultado;
                switch (operacao) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("Divisão por zero");
                        }
                        resultado = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Operação inválida");
                }

                System.out.println("Resultado da operação: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Erro: não é possível dividir por zero.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: operação inválida. Use apenas +, -, * ou /.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada inválida. Digite apenas números inteiros.");
        } finally {
            teclado.close();
            System.out.println("Calculadora finalizada.");
        }
    }
}
