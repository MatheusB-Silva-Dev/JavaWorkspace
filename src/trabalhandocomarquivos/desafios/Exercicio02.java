package TrabalhandoComArquivos.Desafios;

// Desafio Classe File
// Objetivo: Manipular arquivos e pastas
// Criar um arquivo se não existir
// Deletar arquivo existente
// Listar todos os itens de uma pasta
// Identificar se cada item é arquivo ou pasta
// Tratar casos de pasta vazia ou inexistente

import java.io.File;
import java.io.IOException;

public class Exercicio02 {
    public static void main(String[] args)  {

        // Cria um objeto File representando um arquivo específico
        File arquivo1 = new File("C:\\Users\\mathe\\IdeaProjects\\Desafios Java\\src\\TrabalhandoComArquivos\\Desafios\\teste.txt");

        // Tenta criar o arquivo se não existir
        try {
            if(arquivo1.exists()) {
                System.out.println("Arquivo existe!");
            } else if(arquivo1.createNewFile()) {
                System.out.println("Criando arquivo.....");
                System.out.println("Arquivo criado com sucesso!");
            }
        } catch(IOException e) {
            // createNewFile pode lançar IOException, tratamos aqui
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }

        // Tenta deletar o arquivo retorna boolean
        System.out.println("Arquivo deletado! " + arquivo1.delete());

        // Agora trabalhamos com uma pasta inteira
        File pasta = new File("C:\\Users\\mathe\\IdeaProjects\\Desafios Java\\src\\TrabalhandoComArquivos\\Desafios");

        // listFiles() retorna array com os itens da pasta
        File[] arquivos = pasta.listFiles();

        // Se a pasta não existir ou não puder ser lida retorna null
        if(arquivos != null) {

            // Se o array estiver vazio a pasta existe mas não tem nenhum arquivo/pasta dentro
            if(arquivos.length == 0) {
                System.out.println("A pasta existe mas está vazia!");
                } else {
                // Se o array tiver elementos percorremos cada item
                for(File f : arquivos) {
                    // isFile() retorna true se o item for um arquivo normal
                    if(f.isFile()) {
                        System.out.println(f.getName() + " é um arquivo.");

                        // isDirectory() retorna true se o item for uma pasta
                    } else if(f.isDirectory()) {
                        System.out.println(f.getName() + " é uma pasta.");
                    }
                }
            }

        } else {
            // Caso a pasta não exista ou não tenha permissão de acesso
            System.out.println("A pasta não existe ou não pode ser acessada!");


        }

    }
}

// OBS:
// arquivos == null retorna pasta inexistente ou sem permissão
// arquivos.length == 0 retorna pasta existe, mas está vazia
// arquivos.length > 0 retorna pasta existe com arquivos/subpastas
// Sempre tratar esses 3 casos para não ter surpresa no fluxo
