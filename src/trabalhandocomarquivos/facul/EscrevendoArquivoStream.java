package trabalhandocomarquivos.facul;

import java.io.*;


public class EscrevendoArquivoStream {

    public static void main(String[] args) {

        InputStream istream;
        OutputStream ostream = null;
        int c;
        final int EOF = -1; // constante para identificar fim de arquivo

        istream = System.in;

        File outFile = new File("Data.txt"); // referencia o arquivo

        System.out.println("Digite caracteres para escrever no arquivo - pressione Ctrl+Z (Windows) ou Ctrl+D (Linux/Mac) para finalizar");

        try {
            ostream = new FileOutputStream(outFile); // abre o arquivo para escrita

            while ((c = istream.read()) != EOF) {
                ostream.write(c); // grava byte a byte no arquivo
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace(); // mostra o stack trace para debug
        } finally {
            try {
                istream.close();   // fecha entrada
                ostream.close();   // fecha saída
            } catch (IOException e) {
                System.out.println("O arquivo não foi fechado");
            }
        }
    }
}
