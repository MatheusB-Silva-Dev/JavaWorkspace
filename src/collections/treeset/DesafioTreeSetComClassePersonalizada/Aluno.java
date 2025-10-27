package collections.treeset.DesafioTreeSetComClassePersonalizada;

// Classe Aluno implementando Comparable para TreeSet
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;

    //construtor da classe
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //getters e setters
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

    //metodo necessario para TreeSet definir a ordem dos objetos
    @Override
    public int compareTo(Aluno outro) {
        return this.nome.compareTo(outro.nome);
    }
}
