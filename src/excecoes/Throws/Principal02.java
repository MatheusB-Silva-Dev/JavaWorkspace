package excecoes.Throws;

import java.util.Scanner;

public class Principal02 {
        public static void main(String[]args){
            Scanner teclado = new Scanner(System.in);

            //solicita ao usuário o numerador primeiro numero da divisão
            System.out.print("Digite o primeiro número (numerador): ");
            int numerador = teclado.nextInt();

            //solicita ao usuário o denominador segundo número da divisão
            System.out.print("Digite o segundo número (denominador): ");
            int denominador = teclado.nextInt();

            try{
                //cria um objeto da propria classe para chamar o metodo
                new Principal02().fazerDivisao(numerador,denominador);
            }catch(Exception e){
                //captura qualquer exceção lançada durante a execução do metodo
                //exemplo: divisão por zero
                System.out.println("O Programa de Condição de Exceção está terminando ");
            }

            teclado.close();
        }

        //O uso de throws Exception' indica que esse metodo pode lançar
        //uma exceção, que deve ser tratada por quem o chama no caso o main
    public void fazerDivisao(int a,int b) throws Exception {
        //Realiza a divisão
        //se 'b' for 0, ocorre uma ArithmeticException automaticamente
        int resultado = a / b;
        //exibe o resultado da operação
        System.out.println("Resultado da divisão de "+ a + "/" +b + " = " + resultado);
    }
}

