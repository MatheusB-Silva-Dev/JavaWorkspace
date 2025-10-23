package ExeciciosDiversos.MediaComClasse;

/*2. Calculadora de Média com Classe
- Crie uma classe Aluno com nome e 3 notas
- Adicione um método calcularMedia()
- No main, instancie 2 alunos e exiba a média de cada um*/

public class Aluno {
    //private para encapsulamento
    private String nome;
    private double nota1, nota2, nota3;

    //Usando construtor aqui me possibilita instanciar o objeto e ja passar os atributos diretamente
    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodo calcular media com o return definido
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
}
