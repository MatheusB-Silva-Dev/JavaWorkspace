package excecoes.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false; //controla se a operação foi concluida com sucesso

        try{
            while(!valido){
                try{
                    System.out.println("Digite o primeiro número: ");
                    int num1 = teclado.nextInt();
                    teclado.nextLine(); // limpa o buffer

                    System.out.println("Digite o segundo número: ");
                    int num2 = teclado.nextInt();
                    teclado.nextLine(); // limpa o buffer

                    new Exercicio02().dividir(num1, num2); // chama o metodo de divisão
                    valido = true; // encerra o loop se tudo ocorrer sem erros

                }catch(InputMismatchException e) {
                    System.out.println("Digite apenas números!"); // trata entradas invalidas
                    teclado.nextLine(); // limpa buffer em caso de erro
                }catch(ArithmeticException e){
                    System.out.println("Divisão por zero não permitida!");  // trata divisao por zero
                }
            }
        }finally {
            System.out.println("Operação finalizada com segurança!");
            teclado.close(); // garante que o Scanner seja fechado
        }

    }

    public void dividir(int num1, int num2) {
        int resultado = num1 / num2; // realiza a divisão
        System.out.println("Resultado da divisão: " + resultado); // exibe o resultado
    }

}
