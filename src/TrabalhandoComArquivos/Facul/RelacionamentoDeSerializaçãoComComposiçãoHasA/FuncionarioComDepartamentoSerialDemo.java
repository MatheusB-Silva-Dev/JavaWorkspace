package TrabalhandoComArquivos.Facul.RelacionamentoDeSerializaçãoComComposiçãoHasA;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Classe Demo para serialização
public class FuncionarioComDepartamentoSerialDemo {
    public static void main(String[] args) {

        // Criando objeto da classe NovoFuncionario
        NovoFuncionario funcionario = new NovoFuncionario("Sylvia", "E123", new Departamento());

        File outFile = new File("NovoFuncSerial.ser");

        try (FileOutputStream fs = new FileOutputStream(outFile);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {

            os.writeObject(funcionario); // serializa objeto
            System.out.println("Objeto serializado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}