package TrabalhandoComArquivos.Facul;

import java.io.*;

/*
Objetivo deste código:
Ler um arquivo de texto chamado "Data.txt" usando fluxo de caracteres.
Mostrar o conteúdo do arquivo no console, linha por linha.
Diferente do fluxo de bytes (FileInputStream), o fluxo de caracteres (FileReader + BufferedReader)
Entende diretamente caracteres Unicode, facilitando a leitura de textos.
Serve apenas como referência para comparação entre leitura de bytes e leitura de caracteres.
*/

public class LendoArquivoCharacterStream {

    public static void main(String[] args) throws IOException  { //throws passa a responsabilidade da exceção para a jvm

        // FileReader abre um arquivo para leitura de caracteres
        FileReader freader = new FileReader("Data.txt");

        // BufferedReader adiciona uma camada de buffer, permitindo ler linha por linha
        BufferedReader br = new BufferedReader(freader);

        String s; // variável para armazenar cada linha lida

        // Loop para ler o arquivo linha por linha até o final (null indica fim do arquivo)
        while ((s = br.readLine()) != null) {
            System.out.println(s); // imprime cada linha no console
        }

        // Fecha o FileReader (BufferedReader fecha junto)
        freader.close();
    }
}
