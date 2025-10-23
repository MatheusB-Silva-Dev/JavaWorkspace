package TrabalhandoComArquivos.Desafios;

/*
Exercicio – Gravando arquivo com FileWriter

1. Leia do teclado linhas de texto digitadas pelo usuário.
2. Grave cada linha em um arquivo chamado "saida_caracteres.txt" usando FileWriter.
   - Utilize também BufferedWriter para otimizar a escrita.
   - Use newLine() para pular linhas.
3. O programa deve parar quando o usuário digitar "sair".
4. Mostre ao final o caminho absoluto do arquivo criado.
*/

import java.io.*;
import java.util.Scanner;

public class Exercicio06 {
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
