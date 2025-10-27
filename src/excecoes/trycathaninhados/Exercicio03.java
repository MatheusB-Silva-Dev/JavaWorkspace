package excecoes.trycathaninhados;

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
            teclado.nextLine();  // limpa o buffer para ler a operação

            try {
                //leitura da operação desejada
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
                            // lança exceção se tentar dividir por zero
                            throw new ArithmeticException("Divisão por zero");
                        }
                        resultado = num1 / num2; // realiza divisão inteira
                        break;
                    default: // se o usuario digitou qualquer outro simbolo
                        throw new IllegalArgumentException("Operação inválida");
                }

                System.out.println("Resultado da operação: " + resultado);

            } catch (ArithmeticException e) { // trata divisão por zero
                System.out.println("Erro: não é possível dividir por zero.");
            } catch (IllegalArgumentException e) { // trata operação invalida
                System.out.println("Erro: operação inválida. Use apenas +, -, * ou /.");
            }

        } catch (InputMismatchException e) {  //trata números invalidos
            System.out.println("Erro: entrada inválida. Digite apenas números inteiros.");
        } finally {
            teclado.close(); // fecha Scanner
            System.out.println("Calculadora finalizada.");  // mensagem de encerramento
        }
    }
}
