package Excecoes.TryCathAninhados;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            int valor = lerInteiro("Digite o " + i + "º número: ", sc);
            soma += valor;
            if (valor < min) min = valor;
            if (valor > max) max = valor;
        }

        double media = soma / 5.0;
        System.out.println("\nResultados:");
        System.out.println("Soma:  " + soma);
        System.out.println("Média: " + media);
        System.out.println("Menor: " + min);
        System.out.println("Maior: " + max);

        sc.close();
    }

    public static int lerInteiro(String prompt, Scanner sc) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
    }
}
