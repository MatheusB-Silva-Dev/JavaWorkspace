package trabalhandocomarquivos.desafios;

import java.io.*;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        File arquivo = new File("saida_caracteres.txt");  // cria referência para o arquivo "saida_caracteres.txt"

        try (Scanner teclado = new Scanner(System.in);
             // BufferedWriter sobre FileWriter = escreve caracteres no arquivo de forma eficiente, permitindo usar newLine()
             BufferedWriter referencia = new BufferedWriter (new FileWriter(arquivo))) {

            System.out.println("Digite linhas de texto (digite 'sair' para encerrar):");

            while(true) {
                String escrita = teclado.nextLine();
                if(escrita.equalsIgnoreCase("sair")) break;
                referencia.write(escrita); // escreve a linha no arquivo
                referencia.newLine(); // adiciona quebra de linha
            }

            System.out.println("Localização do arquivo: " + arquivo.getAbsolutePath());

        }catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
