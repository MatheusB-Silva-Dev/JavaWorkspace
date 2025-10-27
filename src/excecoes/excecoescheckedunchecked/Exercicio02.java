package excecoes.excecoescheckedunchecked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //criando o Scanner

        //checked exception
        try{
            //tenta abrir o arquivo "usuarios.txt" para leitura
            BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"));
            String linha = reader.readLine(); //le a primeira linha do arquivo (caso exista)
            reader.close(); //fecha o leitor de arquivo
        } catch(IOException e) {
            //caso o arquivo não exista ou ocorra algum erro de leitura,
            //o programa entra aqui e exibe a mensagem de erro
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }

        //unchecked exceptions
        try{
            int num = 100; //numero base para a divisão
            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt(); //captura da idade do usuario

            //realiza uma divisão para demonstrar excecao caso idade = 0
            int resul = num / idade;
            System.out.println("Resultado da divisão: " + resul);

        }catch(ArithmeticException e) {
            //captura erro caso o usuario digite 0 divisão por zero
            System.out.println("Idade não pode ser zero!");
        }

        //unchecked
        try {
            //criação de um array simples com tres cargos
            String[] cargos = {"Estagiário", "Analista", "Gerente"};
            System.out.println("Digite um numero de 0 a 2: ");
            int numero = teclado.nextInt(); //captura índice desejado
            //exibe o cargo correspondente ao índice informado
            System.out.println("Cargo correspndente ao indice: " + cargos[numero]);

        }catch(ArrayIndexOutOfBoundsException e){
            //captura erro caso o usuario digite um numero fora do intervalo 0 a 2
            System.out.println("Indice inexistente!");

        }finally {
            //bloco finally sempre executado
            System.out.println("Programa encerrado. Obrigado!");
            teclado.close(); //fecha scanner
        }

    }
}
