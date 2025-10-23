package TrabalhandoComArquivos.Desafios;

/*
Exercicio – Gravando arquivo com FileOutputStream

1. Leia do teclado linhas de texto digitadas pelo usuário.
2. Grave cada linha em um arquivo chamado "saida_bytes.txt" usando FileOutputStream.
   - Converta cada linha em um array de bytes antes de gravar.
   - Adicione um quebra de linha manualmente ("\n") para separar as linhas.
3. O programa deve parar quando o usuário digitar "sair" (ignorando maiúsculas e minúsculas).
4. Mostre ao final o caminho absoluto do arquivo criado.
*/

import java.io.*;
import java.util.Scanner;

public class Exercicio07 {
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
