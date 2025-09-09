package ExeciciosDiversos;
/* Tabuada Inteligente
- Receba um número entre 1 e 10
        - Imprima a tabuada desse número de 1 a 10
        - Use for ou while, como preferir*/

import java.util.Scanner;

public class Diverso02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 10: ");
        int num = teclado.nextInt();
        teclado.nextLine();

// Validação simples
        if (num < 1 || num > 10) {
            System.out.println("Número inválido. Encerrando o programa.");
            return; // encerra o método main
        }

        System.out.println("Escolha a operação: 1 - Soma | 2 - Multiplicação ");
        int i = 1;
        int escolha = teclado.nextInt();
        while(i<=10) {
            if (escolha == 1) {
                int soma = num + i;
                System.out.println(num  + " + " + i + " = " + soma);
            } else if(escolha == 2) {
                int mult = num * i;
                System.out.println(num + " * " + i + " = " + mult);
            }
           i++;
        }

    }
}
