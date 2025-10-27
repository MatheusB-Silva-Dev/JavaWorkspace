package execiciosdiversos.MediaComClasse;

public class Main {
    public static void main(String[] args) {
        /*Aluno aluno1 = new Aluno();
        aluno1.setNome("Matheus");
        aluno1.setNota1(6);
        aluno1.setNota2(5);
        aluno1.setNota3(8);*/

        //por ter usado o construtor me possibilita instanciar assim evitando o monte de linhas acima
        Aluno aluno1 = new Aluno("Matheus", 6,5,8);
        double media = aluno1.calcularMedia();
        System.out.println("Média do aluno: " + aluno1.getNome() + ": " + media);
    }
}
