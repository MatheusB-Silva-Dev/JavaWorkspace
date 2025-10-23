package Excecoes.ExcecoesCheckedUnchecked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal01 {

    public static void main(String[] args) {
        String filename = "teste.txt";

        try {
            String fileContent = new Principal01().readFile(filename);
            System.out.println(fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo " + filename + " não encontrado, por favor cheque o nome do arquivo.");
        } catch (IOException e) {
            System.out.println("O arquivo não possui permissão de leitura, por favor verifique a permissão.");
        }
    }

    public String readFile(String filename) throws FileNotFoundException, IOException {
        FileInputStream fin = new FileInputStream(filename);
        int i;
        StringBuilder sb = new StringBuilder();

        // lê até EOF (-1)
        while ((i = fin.read()) != -1) {
            sb.append((char) i);
        }

        fin.close();
        return sb.toString();
    }
}