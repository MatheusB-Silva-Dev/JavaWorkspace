package TrabalhandoComArquivos.Desafios;

/*
 Crie um programa que leia linhas digitadas pelo usuário no console
 e as salve em um arquivo de texto chamado "Anotações.txt".
 - O programa deve continuar lendo até que o usuário digite "sair"
   (sem considerar maiúsculas ou minúsculas).
 - Cada linha digitada deve ser gravada no arquivo em uma nova linha.
 - Utilize Scanner para a leitura e BufferedWriter para a escrita.
 - Trate possíveis exceções de entrada/saída (IOException).
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio05 {
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
