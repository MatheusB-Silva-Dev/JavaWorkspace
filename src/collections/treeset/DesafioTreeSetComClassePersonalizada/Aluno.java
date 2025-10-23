package Collections.TreeSet.DesafioTreeSetComClassePersonalizada;
/*Desafio Final: Lista de Alunos Ordenados
🎯 Objetivo:
Criar uma lista de alunos usando TreeSet<Aluno> ordenada automaticamente por nome, sem duplicados.

        📋 Regras:
Crie a classe Aluno com:

nome (String)

matricula (int)

A classe deve implementar Comparable<Aluno> e ordenar por nome (em ordem alfabética).

No método main, crie um TreeSet<Aluno>.

Adicione os seguintes alunos:

        "Carlos", matrícula 101

        "Ana", matrícula 102

        "Beatriz", matrícula 103

        "Carlos", matrícula 104 (nome repetido propositalmente)

        "Eduardo", matrícula 105

Exiba todos os alunos com:

Aluno: <nome> | Matrícula: <número>
🧠 Bônus:
Tente adicionar null. O que acontece?

Tente mudar a ordenação para por matrícula (int). O que muda?*/

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Aluno outro) {
        return this.nome.compareTo(outro.nome);
    }
}
