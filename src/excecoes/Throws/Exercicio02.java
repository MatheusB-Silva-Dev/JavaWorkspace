package excecoes.Throws;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        //cria um Scanner para capturar a entrada do usuario
        Scanner teclado = new Scanner(System.in);

        //solicita o primeiro numero
        System.out.println("Digite o primeiro número: ");
        int a = teclado.nextInt();

        //solicita o segundo numero
        System.out.println("Digite o segundo número: ");
        int b = teclado.nextInt();

        try{
            //chama o metodo dividir para realizar a divisão
           new Exercicio02().dividir(a, b);
        } catch (ArithmeticException e) {
            //captura erro de divisão por zero
            System.out.println("Divisão por zero não é permitida.");
        } finally {
            teclado.close(); //fecha scanner
        }

    }

    public void dividir(int a, int b) throws ArithmeticException {
        int resultado = a / b; //realiza a divisão
        System.out.println("Resultado da divisão: " + resultado); //exibe o resultado
    }
}
