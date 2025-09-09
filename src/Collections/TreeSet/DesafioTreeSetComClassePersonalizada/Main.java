package Collections.TreeSet.DesafioTreeSetComClassePersonalizada;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        TreeSet<Aluno> alunos = new TreeSet<Aluno>();

        alunos.add(new Aluno("Carlos", 101));
        alunos.add(new Aluno("Ana", 102));
        alunos.add(new Aluno("Beatriz", 103));
        alunos.add(new Aluno("Carlos", 104));
        alunos.add(new Aluno("Eduardo", 105));

        for(Aluno a : alunos ) {
            System.out.println("Aluno(a): " + a.getNome() + " | Matricula: " + a.getMatricula());
        }

    }
}
