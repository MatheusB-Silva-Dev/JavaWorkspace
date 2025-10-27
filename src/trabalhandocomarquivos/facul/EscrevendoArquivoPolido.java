package trabalhandocomarquivos.facul;

import java.io.*;
import java.util.Scanner;

public class EscrevendoArquivoPolido {
    public static void main(String[] args) {
        File outFile = new File("Data.txt");

        System.out.println("Digite caracteres para escrever no arquivo. Digite 'sair' para finalizar:");

        // Scanner para entrada do usuário
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {

            String linha;
            while (true) {
                linha = scanner.nextLine();  // Lê a linha inteira
                if (linha.equalsIgnoreCase("sair")) break; // condição de saída
                writer.write(linha);       // escreve no arquivo
                writer.newLine();          // pula linha
            }

            System.out.println("Dados gravados com sucesso em " + outFile.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
            e.printStackTrace(); // mostra detalhes do erro, útil para debug
        }
    }
}
