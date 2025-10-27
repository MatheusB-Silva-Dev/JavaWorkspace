package excecoes.excecoescheckedunchecked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //criação do Scanner para leitura de dados via console

        //checked Exceptions aquelas que o compilador exige tratamento try/catch obrigatório
        try{
            //tenta abrir e ler um arquivo que não existe
            BufferedReader reader = new BufferedReader(new FileReader("arquivo_inexistente.txt"));
            String linha = reader.readLine();
            reader.close();
        } catch(IOException e) {
            //captura o erro caso o arquivo não seja encontrado ou ocorra falha na leitura
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }

        //Unchecked Exceptions são erros em tempo de execução não obrigatórios de tratar, mas recomendavel
        try{
            System.out.println("Digite o primeiro número: ");
            int num1 = teclado.nextInt(); //pode gerar InputMismatchException se for digitado algo que não seja numero

            System.out.println("Digite o segundo numero: ");
            int num2 = teclado.nextInt(); //tambem pode gerar InputMismatchException

            //chama o metodo que faz a divisão, atraves da propria classe
            new Exercicio01().dividir(num1, num2);

        } catch(ArithmeticException e)  {
            //captura divisões por zero exemplo classico de Unchecked Exception
            System.out.println("Divisão por zero não permitida!");
        } catch (InputMismatchException e) {
            //captura entradas invalidas exemplo: se o usuário digitar texto em vez de numero
            System.out.println("Digite apenas numeros!");
        } finally {
            //o bloco finally e executado sempre com ou sem erro
            System.out.println("Programa finalizado com sucesso!");
            teclado.close(); //fecha o scanner
        }

    }

    //Metodo que realiza a divisão entre dois numeros inteiros
    public void dividir(int num1, int num2) throws ArithmeticException, InputMismatchException {
        //pode lançar ArithmeticException caso o divisor (num2) seja zero
        int resul = num1 / num2;
        System.out.println("Resultado da divisão: " + resul);
    }
}
