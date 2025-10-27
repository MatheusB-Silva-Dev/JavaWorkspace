package excecoes.excecoescheckedunchecked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal01 {

    public static void main(String[] args) {
        String filename = "teste.txt"; //nome do arquivo que sera tentado ler

        try {
            //chama o metodo readFile() para ler o conteudo do arquivo
            String fileContent = new Principal01().readFile(filename);
            //exibe o conteudo lido no console
            System.out.println(fileContent);
        } catch (FileNotFoundException e) {
            //captura o erro caso o arquivo não seja encontrado no diretorio
            System.out.println("Arquivo " + filename + " não encontrado, por favor cheque o nome do arquivo.");
        } catch (IOException e) {
            //captura erro caso o arquivo exista mas não possa ser lido falta de permissão por exemplo
            System.out.println("O arquivo não possui permissão de leitura, por favor verifique a permissão.");
        }
    }

    public String readFile(String filename) throws FileNotFoundException, IOException { // throws: Isso obriga quem chama o metodo
        //cria um fluxo para ler o arquivo byte a byte                                  // no caso o main a tratar esses erros.
        FileInputStream fin = new FileInputStream(filename);
        int i; //variavel usada para armazenar cada byte lido
        StringBuilder sb = new StringBuilder(); //usado para montar o texto completo

        //le o arquivo até chegar no final EOF = End Of File que retorna -1
        while ((i = fin.read()) != -1) {
            sb.append((char) i); //converte o byte em caractere e adiciona ao texto
        }

        //fecha o arquivo após a leitura
        fin.close();
        //retorna o conteudo do arquivo convertido em String
        return sb.toString();
    }
}