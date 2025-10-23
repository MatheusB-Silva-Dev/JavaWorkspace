package TrabalhandoComArquivos.Desafios;
/*
Ler um arquivo chamado "entrada.txt" e imprimir todo o conteudo no console.
Se o arquivo não existir, capturar a exceção e informar ao usuário.
Garantir que o fluxo de entrada seja fechado corretamente, usando try-catch ou try-with-resources.
Objetivo: praticar leitura de arquivo, trabalhar com InputStream e consolidar o tratamento de exceções.
*/

import java.io.*; //importa todas as classes de entrada/saída

public class Exercicio03 {
    public static void main(String[] args) {
        final int EOF = -1; //constante de referencia para identificar o fim do arquivo
        int dado; //armazena cada byte lido do arquivo

        //cria referência para o arquivo "Entrada.txt"
        File inputFile = new File("C:\\Users\\mathe\\IdeaProjects\\Desafios Java\\src\\TrabalhandoComArquivos\\Entrada.txt");

        //try-with-resources garante que o InputStream será fechado automaticamente
        try (InputStream inputStream = new FileInputStream(inputFile)) {
            OutputStream outputStream = System.out; //usando o console para saida

            //le o arquivo byte a byte até chegar ao fim (-1)
            while((dado = inputStream.read()) != EOF) {
                System.out.print((char) dado); //converte o byte para char e imprime
            }
            outputStream.flush(); //garante que tudo que estava no buffer foi escrito

        } catch(FileNotFoundException e) {
            //caso o arquivo não exista
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace(); //mostra detalhes do erro para debug
        } catch (IOException e) {
            //qualquer outro erro de leitura/escrita
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        } 
    }
}
