package excecoes.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro número: ");
            double num1 = teclado.nextDouble();
            teclado.nextLine();//consome quebra de linha

            System.out.println("Digite o segundo número: ");
            double num2 = teclado.nextDouble();
            teclado.nextLine();//consome quebra de linha

            new Exercicio01().subtrair(num1, num2); //chama o mrtodo subtarir
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite apenas números.");
        } finally {
            teclado.close(); // fecha o scanner
        }
    }


    public void subtrair (double num1, double num2){
            double resultado = num1 - num2; // realiza a subtração
            System.out.println("Resultado de num 1 - num 2: " + resultado);
    }
}
