package excecoes.trycathaninhados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try{
            //leitura dos dois primeiros números para divisão
            System.out.println("Digite um número inteiro: ");
            int num1 = teclado.nextInt();

            System.out.println("Digite outro número inteiro: ");
            int num2 = teclado.nextInt();

            try{
                new Exercicio06().dividir(num1, num2); // chama etodo de divisão

            }catch (ArithmeticException e){ // trata divisão por zero
                System.out.println("Divisão por zero não permitida!");
            }finally {
                System.out.println("Finalizando bloco interno."); // mensagem de encerramento do bloco interno
            }

            //Segundo bloco: multiplicação simples
            try {
                int numero = 100;
                System.out.println("Digite um valor para multiplicar por 100: ");
                int num3 = teclado.nextInt();
                int resul = numero * num3;
                System.out.println("Resultado da multiplicação: " + resul);

            } catch (InputMismatchException e){ // trata entrada inválida
                System.out.println("Bloco teste, digite apenas número!");

            }finally {
                System.out.println("Finalizando bloco do meio!"); // mensagem de encerramento do bloco do meio
            }

        }catch (InputMismatchException e) {
            System.out.println("Digite apenas números!");
        }finally {
            System.out.println("Finalizando bloco Externo.");
        }
    }

    //metodo que realiza divisão entre dois inteiros
    public void dividir(int num1, int num2){
        int resultado = num1 / num2; // divisão inteira
        System.out.println("Resultado da divisão: " + resultado);
    }
}
