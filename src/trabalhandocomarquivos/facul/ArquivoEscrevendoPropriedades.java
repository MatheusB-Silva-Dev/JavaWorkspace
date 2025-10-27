package trabalhandocomarquivos.facul;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ArquivoEscrevendoPropriedades {

    public static void main(String[] args) {

        // Criando objeto Properties
        Properties prop = new Properties();

        try {
            // Definindo pares chave-valor
            prop.setProperty("Gustavo", "Guilherme");
            prop.setProperty("Monica", "Marcelo");
            prop.setProperty("Madhya_Pradesh", "Ingrid");
            prop.setProperty("Ricardo", "Jorge");
            prop.setProperty("Pablo", "Melissa");
            prop.setProperty("Agatha", "Lyvia");

            // Salvando propriedades no arquivo 'capitals.properties' na raiz do projeto
            prop.store(new FileOutputStream("capitals.properties"), null);

            System.out.println("Arquivo capitals.properties criado com sucesso!");

        } catch (IOException ex) {
            // Tratamento de exceção de I/O
            ex.printStackTrace();
        }
    }
}
