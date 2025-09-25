package TrabalhandoComArquivos.Desafios;

/*
Desafio – Gravando arquivo de propriedades com Java (store)

 Crie um objeto Properties para armazenar pares chave-valor.
 Peça para o usuário digitar pelo menos 4 propriedades diferentes (ex: FileName, Author_Name, Website, Topic).
 Grave essas propriedades em um arquivo chamado "minhaConfigSaida.properties" usando o método store().
 Mostre no console a mensagem de sucesso e o caminho absoluto do arquivo criado.
 Trate possíveis exceções de I/O (FileNotFoundException e IOException).
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //cria um objeto Properties para armazenar os pares chave-valor
        Properties prop = new Properties();
        //cria um objeto File que representa o arquivo que será gerado
        File arquivo = new File("meu_arquivo.properties");

        //scanner para ler entrada do usuário try-with-resources fecha o Scanner automaticamente
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite as propriedades: ");

            //captura a chave e valor para a propriedade FileName
            System.out.println("Digite a chave FileName: ");
            String fileNameChave = teclado.nextLine();
            System.out.println("Digite o valor FileName: ");
            String fileNameValor = teclado.nextLine();
            prop.setProperty(fileNameChave, fileNameValor);

            //captura a chave e valor para a propriedade Author_Name
            System.out.println("Digite a chave Author_Name: ");
            String AuthorNameChave = teclado.nextLine();
            System.out.println("Digite o valor Author_Name: ");
            String AuthorNameValor = teclado.nextLine();
            prop.setProperty(AuthorNameChave, AuthorNameValor);

            //captura a chave e valor para a propriedade Website
            System.out.println("Digite a chave Website: ");
            String websitChave = teclado.nextLine();
            System.out.println("Digite o valor Website: ");
            String websitValor = teclado.nextLine();
            prop.setProperty(websitChave, websitValor);

            //captura a chave e valor para a propriedade Topic
            System.out.println("Digite a chave Website: ");
            String topicChave = teclado.nextLine();
            System.out.println("Digite o valor Website: ");
            String topicValor = teclado.nextLine();
            prop.setProperty(topicChave, topicValor);

            //grava todas as propriedades no arquivo indicado
            prop.store(new FileOutputStream(arquivo), null);

            //mostra no console a confirmação e o caminho absoluto do arquivo criado
            System.out.println("Arquivo gerado com sucesso em: " + arquivo.getAbsolutePath());

        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }



    }
}
