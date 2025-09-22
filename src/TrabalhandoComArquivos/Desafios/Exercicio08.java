package TrabalhandoComArquivos.Desafios;

/*
Desafio – Lendo arquivo de propriedades com Java

1. Crie um objeto Properties para carregar pares chave-valor.
2. Carregue as propriedades de um arquivo chamado "minhaConfig.properties" usando o método load().
3. Mostre no console todas as propriedades carregadas com o método list().
4. Leia e exiba valores específicos de pelo menos 3 chaves (ex: FileName, Author_Name, Website).
5. Trate possíveis exceções de I/O (FileNotFoundException e IOException).
*/


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Exercicio08 {
    public static void main(String[] args) {
        // Cria um objeto Properties que será usado para armazenar pares chave-valor
        Properties prop = new Properties();

        // O try-with-resources garante que o FileInputStream será fechado automaticamente
        try (FileInputStream arquivo = new FileInputStream("C:\\Users\\mathe\\IdeaProjects\\Desafios Java\\src\\TrabalhandoComArquivos\\Desafios\\config_exemplo.properties")) {
            // Carrega as propriedades do arquivo dentro do objeto prop
            prop.load(arquivo);

            // Lê valores específicos de chaves e mostra no console
            System.out.println("Nome do arquivo: " + prop.getProperty("FileName"));
            System.out.println("Autor: " + prop.getProperty("Author"));
            System.out.println("Website: " + prop.getProperty("Website"));

            // Lista todas as propriedades carregadas no console
            prop.list(System.out);

        }catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não encontrado!");
        } catch (IOException e) {
            // Captura qualquer outro erro de entrada/saída (ex: problemas de leitura)
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
