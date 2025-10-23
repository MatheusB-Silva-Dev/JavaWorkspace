package Excecoes.TryCatch;

/*Desafio: Calculadora de Divisão Segura

Crie um programa que:

Peça dois números inteiros ao usuário.

Trate:

InputMismatchException → caso o usuário digite letras ou símbolos em vez de números.

        ArithmeticException → caso o denominador seja zero.

Se o usuário errar, o programa deve pedir o valor novamente até estar correto.

Sempre exiba no final (com finally):*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean valido = false;

        try{
            while(!valido){
                try{
                    System.out.println("Digite o primeiro número: ");
                    int num1 = teclado.nextInt();

                    System.out.println("Digite o segundo númeoro: ");
                    int num2 = teclado.nextInt();

                    new Exercicio02().dividir(num1, num2);
                    valido = true;

                }catch(InputMismatchException e) {
                    System.out.println("Digite apenas números!");
                    teclado.nextLine();
                }catch(ArithmeticException e){
                    System.out.println("Divisão por zero não permitida!");
                    teclado.nextLine();
                }
            }
        }finally {
            System.out.println("Operação finalizada com segurança!");
            teclado.close();
        }

    }

    public void dividir(int num1, int num2) {
        int resultado = num1 / num2;
        System.out.println("Resultado da divisão: " + resultado);
    }

}
