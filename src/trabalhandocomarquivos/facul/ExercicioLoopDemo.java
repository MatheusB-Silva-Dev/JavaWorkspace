package trabalhandocomarquivos.facul;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class ExercicioLoopDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        File arquivo = new File("meu_arquivo.properties");
        // array.Array com as chaves fixas que vamos usar no arquivo de propriedades
        String[] chaves = {"FileName", "Author_Name", "Website", "Topic"};

        try (Scanner teclado = new Scanner(System.in)) {
            // Loop para percorrer cada chave e pedir o valor ao usuário
            for (String chave : chaves) {
                System.out.print("Digite o valor para " + chave + ": ");
                String valor = teclado.nextLine();
                // Armazena a chave e o valor no objeto Properties
                prop.setProperty(chave, valor);
            }

            // Grava as propriedades no arquivo
            prop.store(new FileOutputStream(arquivo), "Arquivo de propriedades criado pelo usuário");

            System.out.println("Arquivo gerado com sucesso em: " + arquivo.getAbsolutePath());

        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não encontrado!");
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
