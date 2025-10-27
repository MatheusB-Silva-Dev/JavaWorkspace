package abstratas.exercicio02;

public class Gerente extends Funcionario {
    //construtor que passa atributo salario da classe funcionario atraves da heranca
    public Gerente(double salario) {
        super(salario); // chama o construtor da superclasse
    }

    // implementação específica do metodo abstrato, polimorfismo em ação
    @Override
    public double getBonus() {
        return this.salario * 2; // bonus diferente do desenvolvedor
    }
}
