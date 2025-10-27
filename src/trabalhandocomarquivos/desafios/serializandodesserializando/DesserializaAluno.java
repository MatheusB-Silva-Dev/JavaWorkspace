package trabalhandocomarquivos.desafios.serializandodesserializando;

import java.io.*;

public class DesserializaAluno {
    public static void main(String[] args) {
        // Cria referência ao arquivo serializado
        File readFile = new File("C:\\Users\\mathe\\IdeaProjects\\Desafios Java\\src\\TrabalhandoComArquivos\\Desafios\\SerializandoDesserializando\\alunos.ser");

        try (FileInputStream abrindo = new FileInputStream(readFile);
        ObjectInputStream desserializando = new ObjectInputStream(abrindo)) {

            // Loop para ler 3 objetos do arquivo
            for(int i = 1; i<= 3; i++) {
                // Desserializa o objeto e faz cast para Aluno
                Aluno aluno = (Aluno) desserializando.readObject();
                // Exibe dados do aluno
                System.out.println("--- Aluno " + i + " ---");
                System.out.println("Nome do aluno " + aluno.getNome());
                System.out.println("Idade do aluno: " + aluno.getIdade());
                System.out.println("Matricula do aluno: " + aluno.getMatricula());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro: ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro: ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: ");
            e.printStackTrace();
        }
    }
}
