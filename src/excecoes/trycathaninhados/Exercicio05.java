package excecoes.trycathaninhados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Digite o primeiro número: ");
            int num1 = teclado.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = teclado.nextInt();

            try{
                new Exercicio05().dividir(num1, num2);//chama metodo de divisão

            }catch(ArithmeticException e){
                System.out.println("Divisão por zero não permitida!"); //trata divisão por zero
            }

        }catch(InputMismatchException e) {
            System.out.println("Digite somente numeros inteiros!"); //trata entrada invalida
        }finally {
            System.out.println("Operação finalizada!");
            teclado.close();
        }

    }

    //metodo que realiza divisão entre dois inteiros
    public void dividir(int num1, int num2){
        int resultado = num1 / num2; //divisão inteira
        System.out.println("Resultado da divisão: " + resultado); // exibe resultado
    }
}
