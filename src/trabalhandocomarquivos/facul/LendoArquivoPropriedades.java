package trabalhandocomarquivos.facul;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoPropriedades {

    public static void main(String[] args) {

        // Cria um objeto Properties para armazenar pares chave-valor
        Properties prop = new Properties();

        try {
            // Carrega o arquivo de propriedades
            FileInputStream arquivo = new FileInputStream("C:\\Users\\mathe\\IdeaProjects\\Desafios Java\\src\\TrabalhandoComArquivos\\Facul\\minhaConfig.properties");
            prop.load(arquivo);

            // Mostra todas as propriedades no console
            prop.list(System.out);

            // Lendo cada valor de propriedade específico
            System.out.println("Nome do arquivo: " + prop.getProperty("FileName"));
            System.out.println("Nome do autor: " + prop.getProperty("Author_Name"));
            System.out.println("Website: " + prop.getProperty("Website"));
            System.out.println("Tópico: " + prop.getProperty("Topic"));

            // Fecha o arquivo
            arquivo.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException ex) {
            // Imprime detalhes do erro caso ocorra algum problema de I/O
            ex.printStackTrace();
        }

    }

}
