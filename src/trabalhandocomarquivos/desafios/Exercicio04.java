package trabalhandocomarquivos.desafios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        File arquivo = new File("Anotações.txt"); // cria a referencia do arquivo

        try (Scanner teclado = new Scanner(System.in); //é try-with-resources (fecha automático).
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) { // abre ou cria o arquivo para escrita

            while(true) {  // Laço infinito até o usuário decidir sair”
                String linha = teclado.nextLine();
                if (linha.equalsIgnoreCase("sair")) break; // condição para finalizar a gravação
                writer.write(linha); // escreve no arquivo
                writer.newLine(); // pula linha

                System.out.println("Localização do arquivo: " + arquivo.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
