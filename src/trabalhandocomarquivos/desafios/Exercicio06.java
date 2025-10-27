package trabalhandocomarquivos.desafios;

import java.io.*;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        // Cria um objeto File que representa o arquivo de saída
        File arquivo = new File("saida_bytes.txt");

        // try-with-resources: Scanner para entrada e FileOutputStream para escrita em bytes
        try (Scanner teclado = new Scanner(System.in);
            OutputStream ostream = new FileOutputStream(arquivo)) {

            System.out.println("Digite o texto (digite 'sair' para encerrar):");


            while (true) {
                String escrita = teclado.nextLine();

                if (escrita.equalsIgnoreCase("sair")) break;

                // Escrevendo no arquivo (convertendo String para bytes)
                ostream.write(escrita.getBytes());
                // adiciona quebra de linha
                ostream.write("\n".getBytes());
            }

            System.out.println("Localização do arquivo: " + arquivo.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
