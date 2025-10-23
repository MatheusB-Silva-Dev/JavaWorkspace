package TrabalhandoComArquivos.Desafios.SerializandoDesserializando;

// Classe molde para armazenar dados de um aluno
// Implementa Serializable para permitir que objetos dessa classe
// possam ser serializados e desserializados

import java.io.Serializable;

public class Aluno implements Serializable {
    String nome;
    int idade;
    String matricula;

    // Construtor para inicializar os atributos
    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    // Métodos getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }
}
