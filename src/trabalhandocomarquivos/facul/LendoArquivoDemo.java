package TrabalhandoComArquivos.Facul;

import java.io.*;

public class LendoArquivoDemo {
    public static void main(String[] args) {
        final int EOF = -1;            // constante para fim de arquivo
        int c;                         // variável para receber bytes lidos

        File inputFile = new File("C:\\Users\\mathe\\IdeaProjects\\Desafios Java\\src\\TrabalhandoComArquivos\\Facul\\Data.txt");

        // try-with-resources: garante fechamento do InputStream automaticamente
        try (InputStream istream = new FileInputStream(inputFile)) {
            OutputStream ostream = System.out; // System.out NÃO deve ser fechado

            // lê byte a byte até -1 (EOF)
            while ((c = istream.read()) != EOF) {
                ostream.write(c); // escreve o byte no stdout
            }
            ostream.flush(); // garante que tudo foi escrito
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
            e.printStackTrace(); // útil para debug
            System.exit(1);      // encerra o programa com código de erro
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

