package excecoes.trycathaninhados;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;  //acumula a soma dos numeros
        int min = Integer.MAX_VALUE; //inicializa menor valor com o maximo possivel
        int max = Integer.MIN_VALUE; //inicializa maior valor com o minimo possivel

        // loop para ler 5 números
        for (int i = 1; i <= 5; i++) {
            int valor = lerInteiro("Digite o " + i + "º número: ", sc); // lê número validado
            soma += valor; // atualiza soma
            if (valor < min) min = valor; // atualiza minimo
            if (valor > max) max = valor; // atualiza maximo
        }

        double media = soma / 5.0; //calcula média
        System.out.println("\nResultados:");
        System.out.println("Soma:  " + soma);
        System.out.println("Média: " + media);
        System.out.println("Menor: " + min);
        System.out.println("Maior: " + max);

        sc.close(); //fecha Scanner
    }

    //metodo que lê um número inteiro validado
    public static int lerInteiro(String prompt, Scanner sc) {
        while (true) {  // loop infinito ate o usuario digitar corretamente
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine()); // tenta converter a entrada em inteiro
            } catch (NumberFormatException e) { //mensagem de erro caso a conversao falhe
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
    }
}
