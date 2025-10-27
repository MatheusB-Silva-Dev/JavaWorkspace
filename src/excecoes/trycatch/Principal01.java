package excecoes.trycatch;

import java.util.Scanner;

public class Principal01 {

    public static void main(String[]args){

        Scanner inputDevice=new Scanner(System.in);

        System.out.print("Digite o primeiro número (numerador): ");
        int numerador = inputDevice.nextInt(); //le o numerador

        System.out.print("Digite o segundo número (denominador): ");
        int denominador = inputDevice.nextInt(); //le o denominador

        //chama o metodo que realiza a divisão
        new Principal01().fazerDivisao(numerador, denominador);

    }

    public void fazerDivisao(int a,int b) {

        try{
            int resultado= a / b; //realiza a divisão
            System.out.println("Resultado da divisão de "+ a + "/" +b +"= " + resultado);

        }catch(ArithmeticException e){
            System.out.println("O Programa de Condição de Exceção está terminando");
            //trata divisão por zero
        }

    }

}