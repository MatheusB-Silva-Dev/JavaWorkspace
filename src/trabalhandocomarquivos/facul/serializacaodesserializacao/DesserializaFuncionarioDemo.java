package trabalhandocomarquivos.facul.serializacaodesserializacao;

import java.io.*;

public class DesserializaFuncionarioDemo {
    public static void main(String[] args) {
        File readFile = new File("empSerial.ser");

        try {
            // Fluxo de bytes para ler do arquivo
            FileInputStream fis = new FileInputStream(readFile);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Desserializando o objeto
            Funcionario e = (Funcionario) ois.readObject();

            System.out.println("Nome de funcionário desserializado = " + e.getName());
            System.out.println("ID de funcionário desserializado = " + e.getId());

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
