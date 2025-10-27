package trabalhandocomarquivos.desafios;

import java.io.File;

public class Exercicio01 {
    public static void main(String[] args) {
        // Cria um objeto File apontando para o arquivo "Produto.txt" no diretório especificado
        File arquivo1 = new File("C:\\Users\\mathe\\IdeaProjects\\Desafios Java\\src\\TrabalhandoComArquivos\\Desafios\\Produto.txt");

        // Verifica se o arquivo existe
        if(arquivo1.exists()) {
            // Exibe o nome do arquivo
            System.out.println("Nome do arquivo: " + arquivo1.getName());
            // Exibe o caminho absoluto do arquivo
            System.out.println("Caminho absoluto do arquivo: " + arquivo1.getAbsolutePath());
            // Exibe o tamanho do arquivo em bytes
            System.out.println("Tamanho do arquivo em Bytes: " + arquivo1.length());

            if(arquivo1.canRead()) {
                System.out.println("Arqivo ok para leitura! ");
            } else {
                System.out.println("Arquivo não ok para leitura!");
            }

            if(arquivo1.canWrite()) {
                System.out.println("Arquivo ok para escrita!");
            } else {
                System.out.println("Arquivo não ok para escrita!");
            }

        } else {
            System.out.println("Arquivo não existe!");
        }

        // Mostra o diretório atual do projeto, para saber de onde o programa está sendo executado
        System.out.println("Diretório atual: " + new File("").getAbsolutePath());

    }
}
