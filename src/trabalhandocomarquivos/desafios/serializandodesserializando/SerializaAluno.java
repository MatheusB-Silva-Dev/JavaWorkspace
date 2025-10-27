package trabalhandocomarquivos.desafios.serializandodesserializando;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SerializaAluno {
    public static void main(String[] args) {
        // Cria referência ao arquivo onde os objetos serão salvos
        File outFile = new File("alunos.ser");

        // try-with-resources garante que scanner e streams serão fechados automaticamente
        try (Scanner teclado = new Scanner(System.in);
        FileOutputStream abrir = new FileOutputStream(outFile);
        ObjectOutputStream salvando = new ObjectOutputStream(abrir)) {

            // Loop para cadastrar 3 alunos
            for (int i = 1; i <= 3; i++) {

                System.out.println("Digite o " + i + " nome: ");
                String nome = teclado.nextLine();

                System.out.println("Digite a idade: ");
                int idade = teclado.nextInt();
                teclado.nextLine(); // Limpa o buffer apos o int

                System.out.println("Digite a matricula: ");
                String matricula = teclado.nextLine();

                // Cria o objeto Aluno com os dados inseridos
                Aluno alunos = new Aluno(nome, idade, matricula);

                // Serializa o objeto e escreve no arquivo
                salvando.writeObject(alunos);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro: ");
        } catch (IOException ex) {
            System.out.println("Erro: ");
            ex.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números! ");
        }
    }
}