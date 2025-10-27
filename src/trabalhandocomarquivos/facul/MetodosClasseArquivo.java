package trabalhandocomarquivos.facul;

import java.io.File;

public class MetodosClasseArquivo {

    public static void main(String[] args) {

        // Cria o objeto File apontando para "Data.txt" na raiz do projeto
        File meuArquivo = new File("Data.txt");

        if (meuArquivo.exists()) {
            System.out.println(meuArquivo.getName() + " existe");
            System.out.println("O arquivo tem " + meuArquivo.length() + " bytes");

            if (meuArquivo.canRead()) {
                System.out.println("ok para leitura (canRead)");
            } else {
                System.out.println("Não está ok para leitura");
            }

            if (meuArquivo.canWrite()) {
                System.out.println("ok para escrita (canWrite)");
            } else {
                System.out.println("Não está ok para escrita");
            }

            System.out.println("Caminho: " + meuArquivo.getAbsolutePath());
            System.out.println("Nome do arquivo: " + meuArquivo.getName());
            System.out.println("Tamanho do arquivo: " + meuArquivo.length() + " bytes");

        } else {
            System.out.println("Arquivo não existe");
        }
    }
}
