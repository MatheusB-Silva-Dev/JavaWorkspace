package Excecoes.TryCathAninhados;

import java.util.Scanner;

public class Principal03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número para dividir 100 por ele:");
            int divisor = Integer.parseInt(scanner.nextLine());

            try {
                int resultado = 100 / divisor;

                try {
                    System.out.println("Digite um número para converter em inteiro:");
                    String textoNumero = scanner.nextLine();

                    int numero = Integer.parseInt(textoNumero);
                    System.out.println("Número convertido: " + numero);

                } catch (NumberFormatException nfe) {
                    System.out.println("Erro: Formato numérico inválido!");
                }

                System.out.println("Resultado da divisão: " + resultado);

            } catch (ArithmeticException ae) {
                System.out.println("Erro: Divisão por zero não é permitida!");
            }

        } catch (Exception e) {
            System.out.println("Erro geral: " + e.getMessage());
        }

        scanner.close();
    }
}
