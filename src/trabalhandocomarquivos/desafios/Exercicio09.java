package trabalhandocomarquivos.desafios;

//Corrigindo o codigo do Exercicio08 com chaves fixas pedindo somente valores ao usuario

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //cria um objeto Properties para armazenar pares chave-valor
        Properties prop = new Properties();
        //cria um objeto File apontando para o arquivo que será criado
        File arquivo = new File("meu_arquivo.properties");

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite os valores das propriedades: ");

            //solicita e armazena o valor para a chave FileName
            System.out.print("Valor para FileName: ");
            String fileNameValor = teclado.nextLine();
            prop.setProperty("FileName", fileNameValor);

            //solicita e armazena o valor para a chave Author_Name
            System.out.print("Valor para Author_Name: ");
            String authorNameValor = teclado.nextLine();
            prop.setProperty("Author_Name", authorNameValor);

            //solicita e armazena o valor para a chave website
            System.out.print("Valor para Website: ");
            String websiteValor = teclado.nextLine();
            prop.setProperty("Website", websiteValor);

            //solicita e armazena o valor para a chave topic
            System.out.print("Valor para Topic: ");
            String topicValor = teclado.nextLine();
            prop.setProperty("Topic", topicValor);

            //gravando as propriedades no arquivo
            prop.store(new FileOutputStream(arquivo), "Arquivo de propriedades criado pelo usuário");

            System.out.println("Arquivo gerado com sucesso em: " + arquivo.getAbsolutePath());

        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não encontrado!");
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
