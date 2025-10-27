package trabalhandocomarquivos.facul.serializacaodesserializacao;

import java.io.*;

public class SerializaFuncionarioDemo {
    public static void main(String[] args) {
        // Criando o objeto a ser serializado
        Funcionario c = new Funcionario("Sylvia", "E123");

        File outFile = new File("empSerial.ser");

        try {
            // Fluxo de bytes para escrever no arquivo
            FileOutputStream fs = new FileOutputStream(outFile);
            ObjectOutputStream os = new ObjectOutputStream(fs);

            // Serializando o objeto
            os.writeObject(c);

            os.close();

            System.out.println("Objeto serializado com sucesso em: " + outFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
